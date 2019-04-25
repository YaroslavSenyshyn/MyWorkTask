package com.lits.javaBase;

public class Places {
    public void result(int a) {
        int temp = 0;
        for (int i = 1; i < a; i = i * 10) {
            if (a / i > 0) {
                temp++;
            }
        }
        System.out.println(temp);
    }
}
//    Зчитати з клавіатури ціле число
//    Вивести у консоль кількість знаків у цьому числі