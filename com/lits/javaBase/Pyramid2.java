package com.lits.javaBase;

public class Pyramid2 {
    public void result (int x) {
        int temp=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((++temp)+" ");
            }
            System.out.println();
        }

    }
}

//        Вивести числову піраміду на total рядків. total зчитати з консолі.
//        Перший рядок починається з числа 1.
//        У наступних рядках числа збільшуються.