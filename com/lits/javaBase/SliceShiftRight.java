package com.lits.javaBase;

import java.util.Scanner;

public class SliceShiftRight {
    public static void result (int[] array, int start, int end, Scanner sc) {
        InputingArray.input(array, sc);
        PrintingArray.print(array);

        for (int i = end; i > start; i--) {
            array[i] = array [i-1];
        }

        PrintingArray.print(array);
    }
}

//        Написати клас SliceShiftRight та функцію в ньому:
//        public static void sliceShiftRight(int[] array, int start, int end)
//        Здійснити циклічний зсув на один елемент вправо частини масива від індексу start до індексу end