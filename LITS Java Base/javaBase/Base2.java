package com.lits.javaBase;

public class Base2 {
    public void result(int number, int system) {
        int maxResultStepin = system;
        int maxStepin;
        int tempStepin = 0;
        int a = 0;
        if (number < 0) {
            number = number * (-1);
            a++;
        }
        for (maxStepin = 1; number >= maxResultStepin * system; maxStepin++) {
            maxResultStepin = maxResultStepin * system;
        }
        maxStepin = 0;
        for (int temp = maxResultStepin; temp >= 1; temp = (temp / system)) {
            int tempNext = 0;
            number = number - tempStepin;
            for (tempNext = 0; number >= (temp * tempNext); tempNext++) {
                tempStepin = temp * tempNext;
            }
            if ((tempNext - 1) > 9) {
                if (a > 0) {
                    System.out.print("-");
                    a--;
                }
                System.out.print((char) ((tempNext - 1) + 55));
            } else {
                if (a > 0) {
                    System.out.print("-");
                    a--;
                }
                System.out.print(tempNext - 1);
            }
        }
        System.out.println();
    }
}

//        Зчитати ціле число в десятковій системі числення та основу нової системи числення (ціле число від 2 до 36).
//        Вивести у консоль число, записане у новій системі числення.
//        Якщо число перебільшує 9, використати великі літери латинського алфавіту.
//        Для вирішення можна користуватися лише циклами. Не можна користуватися масивами. Використовувати лише тип int