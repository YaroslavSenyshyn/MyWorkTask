package com.lits.javaBase;

public class Factorial {
    public void result(int a) {
        int temp = 1;
        if (a < 0) temp = -1;
        for (int i = 1; i <= a; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}

//        Зчитати ціле число, знайти і вивести у консоль факторіал цього числа
//        У випадку невизначеності вивести -1.
//        Вирішити за допомогою циклів.