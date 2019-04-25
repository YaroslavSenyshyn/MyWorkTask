package com.lits.javaBase;

public class Div3 {
    public void result(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

//    Зчитати min, max. Вивести у стовпчик числа, кратні 3 від min до max включно