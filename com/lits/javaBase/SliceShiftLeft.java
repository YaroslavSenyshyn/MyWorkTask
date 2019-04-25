package com.lits.javaBase;

import java.util.Scanner;

public class SliceShiftLeft {
    public static void result (int[] array, int start, int end, Scanner sc) {
        InputingArray.input(array, sc);
        PrintingArray.print(array);

        for (int i = start; i < end; i++) {
            array[i] = array [i+1];
        }

        PrintingArray.print(array);
    }

}

//        Написати клас SliceShiftLeft та функцію в ньому:
//        public static void sliceShiftLeft(int[] array, int start, int end)
//        Здійснити циклічний зсув частини масиву на один елемент вліво від індексу start до індексу end включно