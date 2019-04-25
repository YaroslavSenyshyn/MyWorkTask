package com.lits.javaBase;

public class Pyramid1 {
    public void result(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//        Вивести піраміду з чисел на total рядків.
//        total зчитати з консолі
//        У кожному рядку числа йдуть від одиниці до номеру рядку через пробіл.