package com.lits.javaBase;

public class Max3 {
    public void result(int a, int b, int c) {
        System.out.print("The biggest number:");
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else System.out.println(c);

    }
}

//        Зчитати з клавіатури три цілі числа та вивести у консоль найбільше з них.
//        У випадку рівності вивести будь-яке.
//        Заборонено використовувати масиви, цикли, функції