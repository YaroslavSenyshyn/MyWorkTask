package com.lits.javaBase;

public class Max5 {
    public void result(int a, int b, int c, int x, int y) {
        System.out.print("The biggest number:");
        if (a > b && a > c && a > x && a > y) {
            System.out.println(a);
        } else if (b > a && b > c && b > x && b > y) {
            System.out.println(b);
        } else if (c > a && c > b && c > x && c > y) {
            System.out.println(c);
        } else if (x > a && x > b && x > c && x > y) {
            System.out.println(x);
        } else System.out.println(y);
    }
}

//        Зчитати з клавіатури п'ять цілих чисел та вивести у консоль найбільше з них.
//        У випадку рівності вивести будь-яке.
//        Заборонено використовувати масиви, цикли, функції.