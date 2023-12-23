package org.example.effective_java.third_edition.weak_hash_map_sample;

import java.util.WeakHashMap;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        WeakHashMap<String, String> cache = new WeakHashMap<>();

        System.out.println(cache);

        String key1 = new String("Key1");

        cache.put(key1, "Value1");

        System.out.println(cache);

        key1 = null;
        System.gc();

        System.out.println(cache);
    }
}
