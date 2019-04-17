package com.lits.javaBase;

public class Even2 {
    public void result(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}

//        Зчитати з клавіатури 2 цілі числа
//        Вивести у рядок усі парні числа у проміжку від першого до другого включно
//        У вказаному проміжку гарантовано є хоча б одне число, яке потрібно вивести