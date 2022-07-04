package com.uzair.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public char getNonRepeated(String s) {
        Map<Character, Integer> map = new HashMap<>();
        s = s.toLowerCase();
        var chars = s.toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;
        return Character.MIN_VALUE;
    }

}
