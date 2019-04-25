package com.lits.javaBase;

import java.util.Scanner;

public class ArrayMerge {
    public static void result(int[] target, int[] src1, int[] src2, Scanner sc) {
        InputingArray.input(src1, sc);
        InputingArray.input(src2, sc);
        PrintingArray.print(src1);
        PrintingArray.print(src2);
        int a = 0;

        if (src1.length == src2.length) {
            for (int i = 0; i < src1.length; i++) {
                if (src1[i] < src2[i]) {
                    target[i + i] = src1[i];
                    target[i + i + 1] = src2[i];
                } else {
                    target[i + i] = src2[i];
                    target[i + i + 1] = src1[i];
                }
            }
        } else if (src1.length < src2.length) {
            for (int i = 0; i < src1.length; i++) {
                if (src1[i] < src2[i]) {
                    target[i + i] = src1[i];
                    target[i + i + 1] = src2[i];
                } else {
                    target[i + i] = src2[i];
                    target[i + i + 1] = src1[i];
                }
            }
            for (int i = src1.length; i < src2.length; i++) {
                target[2 * src1.length + a] = src2[i];
                a++;
            }
        } else {
            for (int i = 0; i < src2.length; i++) {
                if (src1[i] < src2[i]) {
                    target[i + i] = src1[i];
                    target[i + i + 1] = src2[i];
                } else {
                    target[i + i] = src2[i];
                    target[i + i + 1] = src1[i];
                }
            }
            for (int i = src2.length; i < src1.length; i++) {
                target[2 * src2.length + a] = src1[i];
                a++;
            }
        }


        PrintingArray.print(target);
    }
}

//        Написати клас ArrayMerge та метод у ньому:
//        public static void arrayMerge(int[] target, int[] src1, int[] src2)
//        Об'єднати у масиві target масиви src1 та src2.
//        Масиви src1 та src2 відсортовані за зростанням.
//        Отриманий масив target також повинен бути відсортований за зростанням елементів.
//        Необхідна алгоритмічна складність за часом: О(N)

//        Приклад:
//        До запуску arrayMerge:
//        src1 = [1, 2, 4]
//        src2 = [1, 3, 5]
//        target - порожній, але розміром src1.length + src2.length
//        Після:
//        target = [1, 1, 2, 3, 4 ,5]