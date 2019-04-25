package com.lits.javaBase;

public class DivMN {
    public void result(int x, int y, int a, int b) {
        for (int i = x; i <= y; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
            }
        }
    }
}
//        Зчитати з клавіатури цілі числа min, max, m, n.
//        m та n додатні, тобто m >= 0, n >= 0.
//        Вивести у консоль у стовпчик цілі числа від min до max включно, що націло діляться як на m, так і на n.
//        У вказаному проміжку гарантовано є хоча б одне число, яке потрібно вивести