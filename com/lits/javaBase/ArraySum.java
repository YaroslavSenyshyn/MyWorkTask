package com.lits.javaBase;

import java.util.Scanner;

public class ArraySum {
    public static int result(int[] array, Scanner sc) {
        int sum = 0;
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        return sum;
    }
}

//        Написати клас ArraySum та функцію в ньому:
//        public static int arraySum(int[] array)
//        Повернути суму елементів масиву array
//        Розмір масиву гарантовано більше нуля