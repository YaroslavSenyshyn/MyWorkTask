package com.lits.javaBase;

public class Abcz3 {
    public void result (int a, int b, int c) {
        if ((a+b)>c) {
            System.out.println("alpha");
        } else if (a<(b-c)) {
            System.out.println("bravo");
        } else if (b%c==0){
            System.out.println("charlie");
        }else System.out.println("zulu");
    }

}

//        Зчитати з клавіатури три різних, не рівних нулю числа.
//        Програма повинна виконати лише одну із нижчезазначених дій:
//        - Якщо сума першого та другого чисел більше третього числа, вивести alpha
//        - Якщо перше число менше різниці другого та третього чисел, вивести bravo
//        - Якщо друге число кратно третьому, вивести charlie
//        - Якщо не спрацювало нічого з вищезазначеного, вивести zulu