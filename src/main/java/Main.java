package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{2, 3, 1, 7, 11};
        Integer[] array = new Integer[]{-13, 11, -10, -11};
        Integer[] array1 = new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<String> example = new ArrayList(Arrays.asList("One","Two", "Tree", "Four"));
        ArrayList<Integer> example1 = new ArrayList(Arrays.asList(3,9,11,18,20,22));
        ArrayTask arrayTask = new ArrayTask();
        ArrayListTask arrayListTask = new ArrayListTask();

        arrayTask.autoSort(arr);
        System.out.println("Sum of all positive elements = " + arrayTask.onlyPositiveNumber(array));
        System.out.println("Average value of all the elements = " + arrayTask.averageValue(array1));
        arrayListTask.replaceElement(example);
        arrayListTask.deleteElement(example1);
    }
}
