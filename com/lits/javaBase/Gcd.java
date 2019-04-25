package com.lits.javaBase;

public class Gcd {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

//        Знайти найбільший спільний дільник двох введених з консолі чисел. Обидва числа більше нуля.
//        Написати клас Gcd, який буде містити функцію наступної сигнатури:
//        public static int gcd(int a, int b)
//        Використати рекурсію
