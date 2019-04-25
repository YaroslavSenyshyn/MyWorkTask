package com.lits.javaBase;

public class Pyramid {
    public void result(int x, int y, int z) {
        int temp = 1;
        for (int i = 0; i < x; i++) {
            if (y > i) {
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (z > j) {
                    temp++;
                    continue;
                }
                System.out.print((temp++) + " ");
            }
            System.out.println();
            temp = 1;
        }
    }
}

//        Вивести у консоль числову піраміду на total рядків.
//        У кожному рядку числа йдуть від одиниці до номеру рядку через пробіл.
//        Пропустити rows рядків та cols колонок.
//        Цілі додатні числа total, rows та cols зчитати з консолі.
//        У виводі не повинно бути порожніх рядків до та після чисел.
