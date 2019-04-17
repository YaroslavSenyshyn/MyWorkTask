package com.lits.javaBase;

public class MultipleN {
    public void result (int a, int b) {
        for (int i = 0; i <= a; i++) {
            if (i%b==0) {
                System.out.print(i+" ");
            }
        }
    }
}

//        Зчитати з клавіатури ціле невід'ємне число - максимум.
//        Зчитати з клавіатури цілий, відмінний від нуля дільник.
//        Вивести у рядок числа від нуля до вказанного максимума включно, що кратні заданому дільнику.