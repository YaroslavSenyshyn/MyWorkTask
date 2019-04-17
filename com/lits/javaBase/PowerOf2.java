package com.lits.javaBase;

public class PowerOf2 {
    public void result(int a) {
        int temp = 1;
        System.out.print(temp + " ");
        for (int i = 0; i < a; i++) {
            temp = temp * 2;
            System.out.print(temp + " ");
        }
    }
}

//        Зчитати з клавіатури ціле невід'ємне число. Вивести через пробіл степені числа 2 від нульової до заданої.
//        Використати цикл.
//        * Заборонено використовувати бібліотеку Math. Вирішується множенням у циклі.