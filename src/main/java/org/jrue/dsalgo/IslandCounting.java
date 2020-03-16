package org.jrue.dsalgo;

public class IslandCounting {


    public int countIsland(int[][] matrix) {
        int totalIsland = 0;

        for(int r =0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                if(matrix[r][c] == 1) {
                    totalIsland += 1;
                    sinkNeighborIsland(matrix, r, c);
                }
            }
        }


        return totalIsland;
    }

    private void sinkNeighborIsland(int[][] matrix, int r, int c) {

        if(r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || matrix[r][c] == 0)
            return;

        matrix[r][c] = 0;
        sinkNeighborIsland(matrix, r + 1 , c);
        sinkNeighborIsland(matrix, r - 1 , c);
        sinkNeighborIsland(matrix, r, c + 1);
        sinkNeighborIsland(matrix, r , c - 1);
    }

}
