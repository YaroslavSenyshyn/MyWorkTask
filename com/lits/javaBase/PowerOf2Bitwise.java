package com.lits.javaBase;

public class PowerOf2Bitwise {
    public static void result (int exponent) {
        int result = 0;
        for (int i = 1; i <= exponent ; i++) {
            if (exponent>0) {
                result = 2<<(exponent-1);
            }
        }
        System.out.println(result);
    }
}

//        Написати клас PowerOf2Bitwise та функцію в ньому:
//        public static int powerOf2(int exponent)
//        Функція підносить 2 у степінь exponent
//        Потрібно застосувати побітові оператори
//        Заборонено використовувати цикли
