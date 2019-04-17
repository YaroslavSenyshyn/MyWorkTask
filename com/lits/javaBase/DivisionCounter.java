package com.lits.javaBase;

public class DivisionCounter {
    public void result(int a) {
        int temp = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) temp++;
        }
        System.out.println(temp);
    }
}

//    Зчитати ціле додатнє число, вивести у консоль кількість усіх цілих дільників цього числа