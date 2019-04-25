package com.lits.javaBase;

import java.util.Scanner;

public class ArrayMax {
    public static int result(int[] array, Scanner sc) {
        int max = 0;
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (i == 0) {
                max = array[0];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

//        Написати клас ArrayMax та функцію в ньому:
//        public static int arrayMax(int[] array)
//        Повернути значення найбільшого елементу в масиві array
//        Заборонено використовувати Collections.max()