package com.lits.javaBase;

public class Max4 {
    public void result(int a, int b, int c, int z) {
        System.out.print("The biggest number:");
        if (a > b && a > c && a > z) {
            System.out.println(a);
        } else if (b > a && b > c && b > z) {
            System.out.println(b);
        } else if (c > a && c > b && c > z) {
            System.out.println(c);
        } else System.out.println(z);
    }
}
//        Зчитати з клавіатури чотири цілі числа та вивести у консоль найбільше з них.
//        У випадку рівності вивести будь-яке.
//        Заборонено використовувати масиви, цикли, функції.