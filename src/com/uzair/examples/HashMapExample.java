package com.uzair.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    public int mostFrequent(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var number : numbers) {
            var count = map.getOrDefault(number, 0);
            map.put(number, count + 1);
        }
        int max = -1, result = numbers[0];
        for (var item : map.entrySet())
            if (item.getValue() > max) {
                max = item.getValue();
                result = item.getKey();
            }
        return result;
    }
    public int countPairWithDifference(int numbers[], int k) {
        Set<Integer> set = new HashSet<>();
        for (var n : numbers)
            set.add(n);
        var count = 0;
        for (var n : numbers) {
            if (set.contains(n + k))
                count++;
            if (set.contains(n - k))
                count++;
            set.remove(n);
        }
        return count;
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int com = target - numbers[i];
            if (map.containsKey(com))
                return new int[] {map.get(com), i};
            map.put(numbers[i], i);
        }
        return null;
    }

}
