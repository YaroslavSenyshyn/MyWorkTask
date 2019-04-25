package com.lits.javaBase;

public class Abcz1 {
    public void result(int a, int b) {
        if (a <= b) {
            System.out.println("alpha");
        } else if (a < 0) {
            System.out.println("bravo");
        } else if (b == 0) {
            System.out.println("charlie");
        } else {
            System.out.println("zulu");
        }


    }
}

//        Зчитати з клавіатури 2 цілих числа
//        Программа повинна виконати лише одну із перелічених операцій:
//        - Якщо перше число не більше другого, вивести alpha
//        - Якщо перше число менше нуля, вивести bravo
//        - Якщо друге число рівне нулю, вивести charlie
//        - Якщо ні один із вищевказаних випадків не спрацював, вивести zulu