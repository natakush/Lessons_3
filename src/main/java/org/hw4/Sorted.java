package org.hw4;

public class Sorted {
    public static void main(String[] args) {
    int[] array = {33, 76, 18, 22, 81, 9, 90, 95};

    System.out.println("Original array:");
    printArray(array);


    int n = array.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[j] > array[j+1]) {

                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }

    System.out.println("Sorted array:");
    printArray(array);
}
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
