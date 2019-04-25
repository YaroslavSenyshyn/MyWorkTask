package com.lits.javaBase;

public class PrevMultiple {
    public void result(int a, int b) {
        int div = b;
        int max = a;

        if (b > 0) {
            for (; b <= a; b = b + div) {
                max = b;
            }
        }

        if (b < 0) {
            for (; b <= a; b = b - div) {
                max = b;
            }
        }
        System.out.println(max);
    }
}

//        Зчитати з клавіатури 2 цілих числа - ділене та дільник. Дільник не рівний нулю.
//        Вивести у консоль найбільше число, кратне дільнику, що не більше діленого.