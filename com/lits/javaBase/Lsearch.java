package com.lits.javaBase;

import java.io.*;
import java.util.Scanner;

public class Lsearch {
    public static void lsearch(File in, File out) {
        try {
            Scanner sc = new Scanner(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            int needle = sc.nextInt();
            int temp;
            int counter = 0;
            while (sc.hasNextInt()) {
                counter++;
                temp = sc.nextInt();
                if (temp == needle) {
                    bw.write("value: " + needle + " - position: " + counter + "\n");
                }
            }
            sc.close();
            bw.close();
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }
}

//        Написати клас Lsearch та метод у ньому:
//        public static void lsearch(File in, File out)
//        У файлі in дане шукане число needle, а також послідовність чисел розміром не більше 100 елементів.
//        needle - перше число у файлі in
//        Знайти needle в масиві та вивести у файл out його індекс або -1 якщо число не було знайдене