package com.lits.javaBase;

import java.util.Scanner;

public class ArrayReverse {
    public static void result(int[] array, Scanner sc) {
        int temp = 0;

        System.out.println("Input array value");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//        Написати клас ArrayReverse та функцію у ньому:
//        public static void arrayReverse(int[] array)
//        Змінити порядок елементів масиву array на протилежний
//        Заборонено використовувати вбудовані методи та додатковий масив
