package org.example;

import java.util.Random;

public class homework_1 {
    public static void main(String[] args) {
        int len = 10;
        int[] numbers = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            numbers[i] = random.nextInt(len);
        }
        pyramidSort(numbers);
        for (int i = 0; i < len; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void pyramidSort(int[] arr) {
        int lenArr = arr.length;

        for (int i = lenArr / 2 - 1; i >= 0; i--)
            sortHeap(arr, lenArr, i);

        for (int i = lenArr - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            sortHeap(arr, i, 0);
        }
    }

    private static void sortHeap(int[] arr, int size, int rootIndex) {
        int largest = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != rootIndex) {
            int tmp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = tmp;
            sortHeap(arr, size, largest);
        }
    }
}