package com.lits.javaBase;

public class MaxDivisor {
    public void result(int a) {
        int half = a / 2;
        for (int i = half; i > 1; i--) {
            if (a % i == 0) {
                System.out.println("Max divisor = " + i);
                break;
            }
            if (i == 2) {
                System.out.println("zero");
            }
        }
    }

}

//        Зчитати з клавіатури ціле додаткове число. Вивести у консоль його найбільший нетривіальний дільник.
//        У випадку невизначеності вивести 0.