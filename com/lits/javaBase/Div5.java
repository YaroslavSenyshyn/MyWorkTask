package com.lits.javaBase;

public class Div5 {
    public void result(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
