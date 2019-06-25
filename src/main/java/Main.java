package main.java;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{2, 3, 1, 7, 11};

        ArraySort arraySort = new ArraySort();
        arraySort.autoSort(arr);
        arraySort.manualSort(arr);
    }
}
