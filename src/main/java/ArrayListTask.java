package main.java;

import java.util.List;

class ArrayListTask {

    /**
     * This method checks all of the array elements and replaces the relevant element if it's value is "Tree" .
     */

    void replaceElement(List<String> stringArrayList) {
        for (String i : stringArrayList) {
            if (i.contentEquals("Tree")) {
                stringArrayList.set(stringArrayList.indexOf(i), "Three");
            }
        }
        System.out.println(stringArrayList);
    }

    /**
     * This method uses Iterator to delete all the elements of the array that can be divided by 3 without the excess.
     */

    void deleteElement(List<Integer> integerArrayList) {
        integerArrayList.removeIf(number -> number % 3 == 0);
        System.out.println(integerArrayList);
    }
}
