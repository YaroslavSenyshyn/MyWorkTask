package com.lits.javaBase;

public class Pyramid2rev {
    public void result(int x) {
        int temp = ((x * x - x) / 2) + x;
//        for (int i = x; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print((temp--)+" ");
//            }
//            System.out.println();
//        }
        for (int i = x; i > 0; i--) {
            temp = temp - i;
            for (int j = 1; j <= i; j++) {
                System.out.print((temp+j) + " ");
            }
            System.out.println();
        }
    }
}

//        Вивести числову піраміду на total рядків. Порядок рядків - зворотній.
//        У першому рядку маємо число 1.
//        У наступних рядках числа збільшуються на 1, розташовані через пробіл.