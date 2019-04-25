package com.lits.javaBase;

import java.util.Scanner;

public class ArrayShiftRight {
    public static void result(int[] array, Scanner sc) {
        InputingArray.input(array,sc);
        PrintingArray.print(array);

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        PrintingArray.print(array);

    }
}

//        Написати клас ArrayShiftRight та функцію в ньому:
//        public static void arrayShiftRight(int[] array)
//        Реалізувати циклічний зсув масиву array на 1 елемент вправо
//        Заборонено використовувати додатковий підмасив