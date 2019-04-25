package com.lits.javaBase;

public class IsSorted {
    public void result(int x1, int x2, int x3, int x4, int x5) {
        int counter = 0;
        if (x1 > x2 || x1 > x3 || x1 > x4 || x1 > x5) {
            counter++;
        } else if (x2 > x3 || x2 > x4 || x2 > x5) {
            counter++;
        } else if (x3 > x4 || x3 > x5) {
            counter++;
        } else if (x4 > x5) {
            counter++;
        }
        if (counter > 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}

//        Зчитати з клавіатури 5 цілих чисел.
//        Перевірити, чи упорядкована послідовність від меншого до більшого.
//        Якщо впорядкована - вивести у консоль «yes», в інакшому випадку - «no».
//        Заборонено використовувати цикли
