package com.lits.javaBase;

import java.util.Scanner;

public class ArrayExchange {
    public static void result (int[] array, Scanner sc) {
        int temp;
        InputingArray.input(array, sc);
        PrintingArray.print(array);

        for (int i = 0; i < array.length-1; i=i+2) {
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

        PrintingArray.print(array);

    }
}

//        Написати клас ArrayExchange та функцію в ньому:
//        public static void arrayExchange(int[] array)
//        Попарно обміняти місцями усі парні елементи масиву array з непарними, починаючи з нуля
//        a[0] <-> a[1]
//        a[2] <-> a[3]
//        ...
//        Якщо останній елемент не має пари - не змінювати його положення
//        Заборонено використовувати додатковий підмасив
