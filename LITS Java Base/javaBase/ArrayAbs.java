package com.lits.javaBase;

import java.util.Scanner;

public class ArrayAbs {
    public static void result(int[] array, Scanner sc) {
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] * -1;
            }
            System.out.print(array[i] + " ");
        }
    }
}

//        Написати клас ArrayAbs та функцію в ньому:
//        public static void arrayAbs(int[] array)
//        Замінити кожен елемент масиву array його абсолютним значенням
