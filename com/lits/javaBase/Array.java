package com.lits.javaBase;

import java.io.*;
import java.util.Scanner;

public class Array {
    public static void array(File in, File out) throws IOException {
        Scanner sc = new Scanner(in);
        BufferedWriter bw = new BufferedWriter(new FileWriter(out));
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
        sc.close();
        bw.close();
    }
}

//        Написати клас Array та метод у ньому:
//        public static void array(File in, File out)
//        Зчитати в масив послідовність чисел довжиною 10 з файлу in
//        Записати цю послідовність через пробіл у файл out
//        Ваші файли на диску можна назвати як завгодно.
//        Ресурси (Scanner, FileWriter etc.) створити та закрити всередині методу array