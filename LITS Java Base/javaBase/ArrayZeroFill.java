package com.lits.javaBase;

public class ArrayZeroFill {
    public static void result(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
            System.out.print(i+1 + "el.:" + arr[i]+ "; ");
        }
    }
}

//        Написати клас ArrayZeroFill та функцію в ньому:
//        public static void arrayZeroFill(int[] arr)
//        Функція  arrayZeroFill заповнює масив array нулями.