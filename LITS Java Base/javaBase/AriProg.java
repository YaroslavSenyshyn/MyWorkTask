package com.lits.javaBase;

public class AriProg {
    public void result (int a, int b, int c) {
        for (int i = 1; i <= c; i++) {
            System.out.print(a+(i-1)*b+" ");
        }
    }
}

//        Зчитати 3 цілі числа - перший член, крок та кількість членів арифметичної прогресії
//        Вивести у рядок через пробіл усі члени прогресії
//        Кількість членів прогресії більше нуля