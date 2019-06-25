package main.java;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    Integer[] arr = new Integer[]{2, 3, 1, 7, 11};

    /**
     * This method sorts the given array via library methods of Arrays and Collections.
     */

    public void autoSort(Integer[] arr) {

        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * This method sorts the given array manually, by replacing the elements.
     */


    public void manualSort(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { // Array printing
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



