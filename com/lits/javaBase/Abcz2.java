package com.lits.javaBase;

public class Abcz2 {
    public void result(int a) {
        if (a % 2 == 0) {
            System.out.println("alpha");
        } else if (a % 3 == 0) {
            System.out.println("bravo");
        } else if (a % 5 == 0) {
            System.out.println("charlie");
        } else System.out.println("zulu");
    }

}

//        Зчитати з клавіатури ціле число.
//        - Якщо число парне, вивести alpha
//        - Якщо число кратне трьом, вивести bravo
//        - Якщо число кратне п'яти, вивести charlie
//        - Якщо число не кратне жодному з наведених варіантів, вивести zulu