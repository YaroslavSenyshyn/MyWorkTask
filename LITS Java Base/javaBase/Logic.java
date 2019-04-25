package com.lits.javaBase;

public class Logic {
    public void result (){
        System.out.println("false AND true is "+(false&true));
        System.out.println("false OR true is "+ (false||true));
        System.out.println("NOT false is "+ (!false));
        System.out.println("NOT true is "+ (!true));
        System.out.println();
        System.out.println("false AND false is "+(false&false));
        System.out.println("true AND true is "+(true&true));
        System.out.println("false OR false is "+ (false||false));
        System.out.println("true OR true is "+ (true||true));
    }
}

//    Вивести у консоль результати роботи логічних операторів ТА. АБО, НІ