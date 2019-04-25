package com.lits.javaBase;

import java.util.Scanner;

public class ArrayPrintReversed {
    public static void result(int[] array, Scanner sc) {
        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i-1] + " ");
        }
    }
}

//        Написати клас ArrayPrintReversed та функцію в ньому:
//        public static void arrayPrintReversed(int[] array)
//        Вивести елементи масиву array у консоль у рядок через пробіл у зворотньому порядку