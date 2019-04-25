package com.lits.javaBase;

import java.util.Scanner;

public class ArraySort {
    public static void result(int[] array, Scanner sc) {
        int temp;
        InputingArray.input(array, sc);
        PrintingArray.print(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        PrintingArray.print(array);
    }
}

//        Написати клас ArraySort та функцію в ньому:
//        public static void arraySort(int[] array)
//        Відсортувати елементи масиву array від більшого до меншого
//        Заборонено гуглити розв'язок. Заборонено використовувати Arrays.sort()