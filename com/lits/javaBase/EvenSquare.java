package com.lits.javaBase;

public class EvenSquare {
    public void result(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
//                System.out.println(Math.pow(i, 2));
                System.out.println(i*2);
            }
        }
    }
}

//        Зчитати з клавіатури числа min и max. Вивести у рядок квадрати усіх парних чисел
//        у проміжку від min до max включно.
//        У вказаному проміжку гарантовано є хоча б одне парне число