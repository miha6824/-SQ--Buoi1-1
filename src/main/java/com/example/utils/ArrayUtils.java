package com.example.utils;

// Utility class for array operations
public class ArrayUtils {
    // Method to calculate the sum of an array
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}
