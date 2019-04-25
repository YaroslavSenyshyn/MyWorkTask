package com.lits.javaBase;

import java.util.Scanner;

public class ArrayIncrement {
    public static void result(int[] arr, int increment, Scanner sc) {
        System.out.println("Input array value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] + increment;
            System.out.print(i+"el:"+arr[i]+"; ");
        }

    }

}

//        Написати клас ArrayIncrement та функцію в ньому
//        public static void arrayIncrement(int[] arr, int increment)
//        Збільшити кожен із елементів масиву array на increment