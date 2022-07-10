package com.uzair.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public void bubbleSort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 1; j < arr.length; j++)
                if (arr[i] < arr[j - 1]) {
                    swap(arr, i, j - 1);
                    isSorted = false;
                }
            if (isSorted)
                return;
        }
    }

    public void bucketSort(int[] arr, int n) {
        int i = 0;
        for (var bucket : createBuckets(arr, n)) {
            Collections.sort(bucket);
            for (var item : bucket)
                arr[i++] = item;
        }
    }

    private List<List<Integer>> createBuckets(int[] arr, int n) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < n; i++)
            buckets.add(new ArrayList<>());
        for (var item : arr)
            buckets.get(item / n).add(item);
        return buckets;
    }

    public void countingSort(int[] arr, int max) {
        int[] count = new int[max + 1];
        for (var item : arr)
            count[item]++;
        int k = 0;
        for (int i = 0; i < count.length; i++)
            for (int j = 0; j < count[i]; j++)
                arr[k++] = i;
    }

    public void quickSort(int[] arr) {
        quickSort(arr, 0 , arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int b = partition(arr, start, end);
        quickSort(arr, start, b - 1);
        quickSort(arr, b + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++)
            if (arr[i] <= pivot)
                swap(arr, i, ++boundary);
        return boundary;
    }

    public void mergeSort(int[] arr) {
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        int[] right = new int[arr.length - mid];
        for (int j = mid; j < arr.length; j++)
            right[j - mid] = arr[j];
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    private void merge(int[] left, int right[], int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];
        while (j < right.length)
            result[k++] = right[j++];
    }

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = getMinIndex(arr, i);
            swap(arr, min, i);
        }
    }

    private int getMinIndex(int[] arr, int i) {
        int minIndex = i;
        for (int j = i; j < arr.length; j++)
            if (arr[j] < arr[i])
                minIndex = j;
        return minIndex;
    }

    private void swap(int[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
