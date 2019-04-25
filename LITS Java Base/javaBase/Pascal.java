package com.lits.javaBase;

public class Pascal {
    public void result(int a) {
        int pascal[][];
        pascal = new int[a][];
        for (int i = 0; i < a; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            System.out.print(pascal[i][0] + " ");
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                System.out.print(pascal[i][j] + " ");
                if (j == i - 1) {
                    System.out.print(pascal[i][i]);
                }
            }
            if ((i == 1)) {
                System.out.print(pascal[i][i]);
            }
            System.out.println();
        }

    }
}

//        Отримати число lines, надрукувати у консолі перші lines рядків трикутника Паскаля.
//        Числа виводити з початку рядка через пробіл.
//        Заборонено використовувати будь-які бібліотеки