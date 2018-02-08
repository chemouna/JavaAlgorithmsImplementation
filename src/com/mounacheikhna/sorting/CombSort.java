package com.mounacheikhna.sorting;

public class CombSort {

    public static <E extends Comparable<? super E>> void sort(E[] input) {
        int gap = input.length;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }

            swapped = false;
            for (int i = 0; i + gap < input.length; i++) {
                if (input[i].compareTo(input[i + gap]) > 0) {
                    E temp = input[i + gap];
                    input[i + gap] = temp;
                    input[i] = temp;
                    swapped = true;
                }
            }
        }
    }

}