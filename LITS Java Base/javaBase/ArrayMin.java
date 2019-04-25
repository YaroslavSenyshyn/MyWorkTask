package com.lits.javaBase;

import java.util.Scanner;

public class ArrayMin {
    public static int result(int[] array, Scanner sc) {
        int min = 0;
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (i == 0) {
                min = array[0];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

//        Написати клас ArrayMin та функцію в ньому:
//        public static int arrayMin(int[] array)
//        Повернути значення найменшого елементу в масиві array
//        Заборонено використовувати Collections.min()