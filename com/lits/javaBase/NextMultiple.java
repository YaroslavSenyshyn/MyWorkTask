package com.lits.javaBase;

public class NextMultiple {
    public void result(int a, int b) {
        int temp = 0;
        for (int i = 1; i < a; i++) {
            temp = b * i;
            if (temp > a) {
                System.out.println(temp+" -least number, multiple divisor, not less than divisible");
                break;
            }
        }
    }
}

//        Зчитати з клавіатури 2 цілих числа - ділене та дільник, дільник не рівний нулю.
//        Вивести у консоль найменше число, кратне дільнику, не менше діленого