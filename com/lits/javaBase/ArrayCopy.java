package com.lits.javaBase;

import java.util.Scanner;

public class ArrayCopy {
    public static void result(int[] source, int[] destination, Scanner sc) {
        destination = new int[source.length];
        System.out.println("Input array value");
        for (int i = 0; i < source.length; i++) {
            source [i] = sc.nextInt();
            destination[i] = source[i];
        }
        System.out.println("Destination array");
        for (int i = 0; i < destination.length; i++) {
            System.out.print(destination[i] + " ");
        }
    }
}

//        Написати клас ArrayCopy та функцію в ньому:
//        public static void arrayCopy(int[] source, int[] destination)
//        Заборонено використовувати System.arraycopy.
//        source - тут вже є значення
//        destination - сюди копіюємо значення з source