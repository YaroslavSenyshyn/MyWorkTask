package com.lits.javaBase;

public class Amoeba {
    public void result (int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println((i)+"h => "+(a*i*2)+" amoeba(s)");
        }
    }
}

//        Зчитати з клавіатури два цілі додаткові числа - кількість одноклітинних організмів у чашці
//        Петрі та кількість годин - тривалість експерименту. Кожну годину кожна клітина ділиться на 2 клітини.
//        Вивести у консоль кількість клітин на кожну годину експерименту