package DailyWork.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146.LRU缓存机制-Medium
 *
 * 通过java8提供的LinkedList类来实现LRU，需要重写removeEldestEntry方法
 * https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#removeEldestEntry-java.util.Map.Entry
 *
 */
public class LRUCache1 {

    private LinkedHashMap<Integer, Integer> cache;

    //most votes中 将缓存大小通过final来定义，保证LRUCache的安全，这是很好的一个习惯
    private final int CAPACITY;

    public LRUCache1(int capacity) {
        CAPACITY = capacity;
        cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

}
