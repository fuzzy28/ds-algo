package org.jrue.dsalgo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestLRUCacheImpl {


    private LRUCacheImpl<String, String> lruCache;

    @Test
    public void testLRUcache() {
        lruCache = new LRUCacheImpl<>(5);
        lruCache.addToCache("1", "1");
        lruCache.addToCache("2", "2");
        lruCache.addToCache("3", "3");
        lruCache.addToCache("4", "4");
        lruCache.addToCache("5", "5");
        assertEquals("[5, 4, 3, 2, 1]", lruCache.getCacheValues());
        lruCache.addToCache("3", "3");
        assertEquals("[3, 5, 4, 2, 1]", lruCache.getCacheValues());
        lruCache.addToCache("6", "6");
        assertEquals("[6, 5, 4, 2, 1]", lruCache.getCacheValues());
    }
}
