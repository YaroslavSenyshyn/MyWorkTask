package com.lits.javaBase;

public class PowerOfX {
    public void result(int a, int b, int lenght) {
        int temp = 1;
        System.out.print(temp + " ");
        temp = a;
        for (int i = 0; i < lenght; i++) {
            temp = temp * b;
            System.out.print(temp + " ");
        }
    }

}

//        Зчитати з клавіатури цілі числа: основу та невід'ємний показник степеню.
//        Вивести через пробіл степені числа основи від нульової до заданої.
//        * Заборонено використовувати бібліотеку Math. Вирішується множенням у циклі.