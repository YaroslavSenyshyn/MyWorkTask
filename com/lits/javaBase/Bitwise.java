package com.lits.javaBase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bitwise {
    public void result(File in, File out) {
        try {
            Scanner sc = new Scanner(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));

            int a = sc.nextInt();
            int b = sc.nextInt();

            bw.write(String.format("%d & %d = %d \n", a, b, a % b));
            bw.write(String.format("%d | %d = %d \n", a, b, a | b));
            bw.write(String.format("%d ^ %d = %d \n", a, b, a ^ b));
            bw.write(String.format("%d << %d = %d \n", a, b, a << b));
            bw.write(String.format("%d >> %d = %d \n", a, b, a >> b));

            sc.close();
            bw.close();
        } catch (IOException e) {
            System.err.println("File not found");
        }

    }
}

//        Написати клас Bitwise і метод у ньому:
//        public static void bitwise(File in, File out)
//        Зчитати з файлу in два числа.
//        Записати в out результат виконання різних побітових операцій.
//        Власне файли можна назвати як завгодно
//        Ресурси для роботи із файлами потрідно створити (і закрити) всередині методу bitwise