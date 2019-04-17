package com.lits.javaBase;

public class DivN {
    public void result (int a, int b, int c){
        for (int i = a; i <=b ; i++) {
            if (i%c==0){
                System.out.println(i);
            }
        }
    }
}

//        Зчитати з клавіатури цілі числа min, max та додатній дільник.
//        Вивести у стовпчик числа, що кратні дільнику, від min до max включно