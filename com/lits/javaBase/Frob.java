package com.lits.javaBase;

import java.io.*;
import java.util.Scanner;

public class Frob {
    public void result(File in, File out) {
        try {
        Scanner sc = new Scanner(in);

        BufferedWriter bw = new BufferedWriter(new FileWriter(out));
        int a = sc.nextInt();
        int[] tempArr = new int[a];

        for (int i = 0; i < a; i++) {
            int temp = sc.nextInt();
            temp = temp ^ 42;
            tempArr[i] = temp;
            bw.write(String.format("%d ", tempArr[i]));
        }
            sc.close();
            bw.close();



        } catch (IOException e) {
            System.err.println("fail");
        }
    }
}

//        Написати клас Frob та метод у ньому:
//        public static void frob(File in, File out)
//        Перше число у файлі in - довжина послідовності, потім записана сама послідовність чисел.
//        Вивести у файл out спотворену послідовність,
//        отриману шляхом застосування побітової операції xor членів вихідної послідовності з числом 42.
//        Кожний новий член виводити в новому рядку.
//        Ресурси створювати та закривати у методі frob