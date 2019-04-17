package com.lits.javaBase;

public class Pyramid1rev {
    public void result (int x) {
        for (int i = x; i > 0; i--) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

//        Вивести числову піраміду на total рядків. total зчитати з консолі.
//        Порядок рядків - зворотній
//        У кожному рядку числа йдуть від одиниці до номера рядку через пробіл.