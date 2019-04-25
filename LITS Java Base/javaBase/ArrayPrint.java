package com.lits.javaBase;

import java.io.*;

public class ArrayPrint {
    public static void arrayPrint(File fileName, int arr[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int last = arr.length - 1;
        for (int i = 0; i < last; i++) {
            bw.write(String.format("%d ", arr[i]));
        }
        bw.write(String.format("%d \n", arr[last]));
        bw.close();
    }
}

//        Написати клас ArrayPrint та функцію в ньому:
//        public static void arrayPrint(File out, int[] arr)
//        Функція виводить елементи масиву arr у файл out у рядок через пробіл.
//        В кінці цього рядку потрібно додати line feed ('\n')