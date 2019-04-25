package com.lits.javaBase;

public class Abcz4 {
    public void result(int a, int b) {
        if (a > b && b > 0) {
            System.out.println("alpha");
        } else if (a < 0 && b == 0) {
            System.out.println("bravo");
        } else if (a == 0 || b == 0) {
            System.out.println("charlie");
        } else System.out.println("zulu");
    }
}

//        Зчитати з клавіатури 2 цілі числа.
//        Програма повинна виконати лишу одну із дій:
//        - Якщо перше число більше другого та друге число більше нуля, вивести alpha
//        - Якщо перше число менше нуля и друге число рівне нулю, вивести bravo
//        - Якщо одне з чисел рівне нулю, вивести charlie
//        - Якщо не спрацювало нічого із вищезазначеного, вивести zulu