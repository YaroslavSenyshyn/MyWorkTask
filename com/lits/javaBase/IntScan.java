package com.lits.javaBase;

import java.io.*;
import java.util.Scanner;

public class IntScan {
    public void result (File in) {
        try {
            Scanner sc = new Scanner(in);
            System.out.println("Number with file: "+sc.nextInt());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

    }
}

//        Написати клас IntScan та функцію в ньому:
//        public static void intScan(File in)
//        Зчитати одне число з файлу in, вивести це число у консоль
//        Ресурси для роботи з файлом повинні бути створені всередині методу intScan,
//        там же виконати вивід у консоль. Перевірятися буде лише цей метод