package com.lits.javaBase;

import java.util.Scanner;

public class SliceReverse {
    public static void result (int[] array, int lo, int hi, Scanner sc) {
        int temp;
        int counter=0;

        InputingArray.input(array, sc);
        PrintingArray.print(array);

        for (int i = lo; i < (lo+((hi-lo)/2)); i++) {
            temp = array[i];
            array[i] = array[hi-counter];
            array[hi-counter] = temp;
            counter++;
        }

        PrintingArray.print(array);
    }
}

//        Написати клас SliceReverse та функцію в ньому:
//        public static void sliceReverse(int[] array, int lo, int hi)
//        Здійснити реверс масиву array від індексу lo до індексу hi включно