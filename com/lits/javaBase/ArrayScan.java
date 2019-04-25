package com.lits.javaBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayScan {
    public static int result(File in, int[] array, int limit) {
        int quantity = 0;
        try {
            Scanner sc = new Scanner(in);
            for (int i = 0; i < limit; i++) {
                array[i] = sc.nextInt();
                quantity++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

        return quantity;
    }

}

//        Написати клас ArrayScan та функцію в ньому
//        public static int arrayScan(File in, int[] array, int limit)
//        Зчитати з файлу in не більше limit елементів у масив array.
//        Повернути кількість зчитаних елементів