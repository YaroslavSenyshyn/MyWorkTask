package com.lits.javaBase;

import java.util.Scanner;

public class ArraySearch {
    public static int result (int[] array, int needle, Scanner sc) {
        int index = -1;
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            if (array[i] == needle) {
                index = i;
            }
        }
        return index;
    }
}

//        Написати клас ArraySearch та функцію в ньому:
//        public static int arraySearch(int[] array, int needle)
//        Функція повертає індекс шуканого числа (needle) або -1 якщо такого числа немає в масиві.
//        Заборонено використовувати indexOf
