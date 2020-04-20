package org.jrue.dsalgo;

import java.util.*;

public class LRUCacheImpl<K,V> {

    private final Map<K,V> map = new LinkedHashMap<>();
    private int size;

    private Deque<K> queue = new LinkedList<>();
    
    public LRUCacheImpl(int size) {
        this.size = size;
    }


    public void addToCache(K key, V value) {
        if(map.containsKey(key)) {
            queue.remove(key);
            queue.offerFirst(key);
            return;
        }
        
        if(map.size() == size) {
           map.remove(queue.remove());
        }
        queue.offerFirst(key);
        map.put(key,value);
    }

    public String getCacheValues() {
       return queue.toString();
    }
}
