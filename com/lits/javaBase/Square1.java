package com.lits.javaBase;

public class Square1 {
    public void result (int x) {
        int temp = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print((temp++)+" ");
            }
            temp = 1;
            System.out.println();
        }
    }
}
//        Вивести у консоль числовий квадрат заданого розміру.
//        У кожному рядку числа розташовані через пробіл.
//        Розмір квадрату зчитати з клавіатури