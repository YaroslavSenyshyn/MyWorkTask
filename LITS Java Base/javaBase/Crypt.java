package com.lits.javaBase;

import java.util.Scanner;

public class Crypt {
    public void result(int x, int b, int x1, int b1, int length, Scanner sc) {
        double tempResult1;
        double tempResult2;
        double detA = x - x1;
        if (detA != 0) {
            tempResult1 = ((1 / detA) * b) + ((-1 / detA) * b1);
            tempResult2 = ((-x1 / detA) * b) + ((x / detA) * b1);
            for (int i = 0; i < length; i++) {
                System.out.println("Input encrypt number");
                double crypt = sc.nextDouble();
                System.out.println("encrypted number: " + crypt + ", deCrypt: " + ((crypt - tempResult2) / tempResult1));
            }
        }

    }
}

//        Числа шифруються за певним алгоритмом із використанням двох секретних числових ключів – A та B.
//        Число множиться на значення ключа А, потім до результату додається значення ключа B.
//        Числа, що шифруються, та значення ключів не перевищують 30000 за абсолютним значенням.
//        Під час розвідувальної опреації стали відомі зашифровані еквіваленти двох чисел.
//        Необхідно знайти підходящі ключі та розшифрувати зашифровану послідовність чисел.
//
//        Вхідні дані:
//        plain1 encrypted1
//        plain2 encrypted2
//        length
//        <послідовність length зашифрованих чисел>
//        Приклад вводу
//        1 3
//        2 5
//        5
//        7 9 11 13 15
//        Приклад виводу
//        3 4 5 6 7