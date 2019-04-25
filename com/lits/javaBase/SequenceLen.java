package com.lits.javaBase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SequenceLen {
    public void result(File in, File out) {
        try {
            Scanner sc = new Scanner(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            int sum = 0;
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                sum++;
            }

            bw.write(String.format("%d ", sum));
            sc.close();
            bw.close();
        } catch (IOException e) {
            System.err.println("File don't found");
        }
    }
}

//        Написати клас SequenceLen та метод у ньому:
//        public static void sequenceLen(File in, File out)
//        Зчитати з файлу in послідовність чисел довжиною не більше 100 елементів.
//        Знайти довжину цієї послідовності та надрукувати у out.
//        Ресурси (Scanner, FileWriter etc) створити та закрити всередині методу sequenceLen
//        Важливо дотримуватися заданої сигнатури