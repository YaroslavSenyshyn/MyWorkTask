package com.lits.javaBase;

public class Odd {
    public void result(int a) {
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

//        Зчитати з клавіатури ціле додаткове число.
//        Вивести у рядок усі непарні числа від нуля до вказаного числа включно