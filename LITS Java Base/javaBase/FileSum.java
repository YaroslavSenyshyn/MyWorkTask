package com.lits.javaBase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSum {
    public void result(File in, File out) {
        try {
            Scanner sc = new Scanner(in);
            BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            bw.write(String.valueOf(sc.nextInt() + sc.nextInt()));
            sc.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

//        Написати клас FileSum і функцію в ньому:
//        public static void fileSum(File in, File out)
//        Зчитати два числа з in.
//        Записати суму цих чисел у файл out.
//        Увага!
//        Для зчитування чисел з файлу in використати Scanner, nextInt()
//        Для запису результату до файлу out використати FileWriter,
//        write(String.valueOf(<result>)). <result> - сума двох зчитаний раніше чисел
//        Scanner та FileWriter потрібно створити всередині методу fileSum і закрити після використання
//        Тестуватися буде лише метод fileSum, важливо дотримуватися заданої назви, кількості і типу параметрів