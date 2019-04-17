package com.lits.javaBase;

public class Square2 {
    public void result(int x) {
        int temp = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print((temp++) + " ");
            }
            System.out.println();
        }
    }
}

//    Вивести у консоль квадрат із чисел заданого розміру
//    Виведені числа починаються з одиниці і постійно збільшуються
//    У кожному рядку числа розділені пробілом
//    Розмір квадрату зчитати з клавіатури