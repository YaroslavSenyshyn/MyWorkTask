package com.lits.javaBase;

import java.math.BigInteger;

public class FactorialRec {
    public int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }
        if (n < 0) {
            return -1;
        }
        return 1;
    }
}

//        Написати клас FactorialRec та метод у ньому:
//        public static int factorial(int n)
//        Функція розраховує факторіал введеного числа n рекурсивно (тобто без циклів)
//        У випадку невизначості вивести -1.
//        Приклад вводу (консоль):
//        5
//        Приклад виводу (консоль)
//        120