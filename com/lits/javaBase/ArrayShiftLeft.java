package com.lits.javaBase;

import java.util.Scanner;

public class ArrayShiftLeft {
    public static void result (int[] array, Scanner sc) {
        InputingArray.input(array,sc);
        PrintingArray.print(array);

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        PrintingArray.print(array);
    }
}

//        Написати клас ArrayShiftLeft та функцію в ньому:
//        public static void arrayShiftLeft(int[] array)
//        Реалізувати циклічний зсув масиву array на 1 елемент вліво
//        Заборонено використовувати додатковий підмасив