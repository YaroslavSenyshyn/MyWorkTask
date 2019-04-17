package com.lits.javaBase;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;


public class ExercisesMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberTask = 0;
        System.out.println("Write number of task: ");

        try {
            numberTask = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Invalid format number");
        }


        switch (numberTask) {

            case 1:
                HelloWorld h = new HelloWorld();
                h.print();
                break;

            case 2:
                Arithmetic a = new Arithmetic();
                System.out.println("Input two number for calculate");
                try {
                    a.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 3:
                Comparison c = new Comparison();
                System.out.println("Input two number for comparison");
                try {
                    c.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 4:
                Logic l = new Logic();
                l.result();
                break;

            case 5:
                CallCost cc = new CallCost();
                System.out.println("Input phone number and quantity minutes");
                try {
                    cc.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 6:
                IsEven ie = new IsEven();
                System.out.println("Input number for verification if even");
                try {
                    ie.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 7:
                IsOdd io = new IsOdd();
                System.out.println("Input number for verification if even");
                try {
                    io.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;
            case 8:
                NextEven ne = new NextEven();
                System.out.println("Input number");
                try {
                    ne.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 9:
                NextOdd no = new NextOdd();
                System.out.println("Input number");
                try {
                    no.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;
            case 10:
                PrevEven pe = new PrevEven();
                System.out.println("Input number");
                try {
                    pe.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 11:
                Max2 m = new Max2();
                System.out.println("Input two number");
                try {
                    m.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 12:
                Max3 m3 = new Max3();
                System.out.println("Input three number");
                try {
                    m3.result(sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 13:
                Max4 m4 = new Max4();
                System.out.println("Input four number");
                try {
                    m4.result(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 14:
                Max5 m5 = new Max5();
                System.out.println("Input five number");
                try {
                    m5.result(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 15:
                IsMultiple im = new IsMultiple();
                System.out.println("Input two number");
                try {
                    im.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 16:
                IsEqual iq = new IsEqual();
                System.out.println("Input two number");
                try {
                    iq.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 17:
                IsLeap il = new IsLeap();
                System.out.println("Input quantity days of year");
                try {
                    il.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 18:
                IsLegalAge ila = new IsLegalAge();
                System.out.println("Input age of man");
                try {
                    ila.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 19:
                IsPositive ip = new IsPositive();
                System.out.println("Input number");
                try {
                    ip.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 20:
                Car car = new Car();
                System.out.println("Input speed of the car and speed limit");
                try {
                    car.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 21:
                Abcz2 abcz = new Abcz2();
                System.out.println("Input number");
                try {
                    abcz.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 22:
                Abcz3 abcz3 = new Abcz3();
                System.out.println("Input three three different, nonzero numbers");
                try {
                    abcz3.result(sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 23:
                Abcz4 abcz4 = new Abcz4();
                System.out.println("Input two integers");
                try {
                    abcz4.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 24:
                Football f = new Football();
                System.out.println("Input quantity of goals by the host and guests in a football match");
                try {
                    f.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 25:
                Equation eq = new Equation();
                System.out.println("Input quadratic discriminant");
                try {
                    eq.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 26:
                MaxDivisor md = new MaxDivisor();
                System.out.println("Input number");
                try {
                    md.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 27:
                Countdown cou = new Countdown();
                System.out.println("Input number");
                try {
                    cou.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 28:
                Natural n = new Natural();
                System.out.println("Input number");
                try {
                    n.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 29:
                Even ev = new Even();
                System.out.println("Input number");
                try {
                    ev.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 30:
                Odd odd = new Odd();
                System.out.println("Input number");
                try {
                    odd.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 31:
                Multiple3 mult = new Multiple3();
                System.out.println("Input number");
                try {
                    mult.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 32:
                Multiple5 mu5 = new Multiple5();
                System.out.println("Input number");
                try {
                    mu5.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 33:
                MultipleN mulN = new MultipleN();
                System.out.println("Input number and divisor");
                try {
                    mulN.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 34:
                PrevMultiple prMu = new PrevMultiple();
                System.out.println("Input number and divisor");
                try {
                    prMu.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 35:
                Div2 div2 = new Div2();
                System.out.println("Input min and max number");
                try {
                    div2.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 36:
                Div3 div3 = new Div3();
                System.out.println("Input min and max number");
                try {
                    div3.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 37:
                Div5 div5 = new Div5();
                System.out.println("Input min and max number");
                try {
                    div5.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 38:
                DivN divN = new DivN();
                System.out.println("Input min, max number and divisor");
                try {
                    divN.result(sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 39:
                MaxN maxN = new MaxN();
                System.out.println("Input quantity numbers");
                try {
                    maxN.result(sc.nextInt(), sc);
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 40:
                MinN minN = new MinN();
                System.out.println("Input quantity numbers");
                try {
                    minN.result(sc.nextInt(), sc);
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 41:
                Amoeba amoeba = new Amoeba();
                System.out.println("Input quantity amoeba and quantity hours");
                try {
                    amoeba.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 42:
                EvenSquare es = new EvenSquare();
                System.out.println("Input min and max number");
                try {
                    es.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 43:
                IsSortedN isSortedN = new IsSortedN();
                System.out.println("Input quantity numbers");
                try {
                    isSortedN.result(sc.nextInt(), sc);
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 44:
                DivisionCounter dc = new DivisionCounter();
                System.out.println("Input number");
                try {
                    dc.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 45:
                AriProg ari = new AriProg();
                System.out.println("Input first number, step and quantity numbers of the arithmetic progression");
                try {
                    ari.result(sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 46:
                Even2 even2 = new Even2();
                System.out.println("Input first number and last number");
                try {
                    even2.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 47:
                Odd2 odd2 = new Odd2();
                System.out.println("Input first number and last number");
                try {
                    odd2.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 48:
                Factorial fact = new Factorial();
                System.out.println("Input number");
                try {
                    fact.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 49:
                IsPrime isPrime = new IsPrime();
                System.out.println("Input number");
                try {
                    System.out.println(isPrime.result(sc.nextInt()));
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 50:
                Crypt crypt = new Crypt();
                System.out.println("Input plain1&encrypted1,plain2&encrypted2 and quantity encrypt number");
                try {
                    crypt.result(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc);
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 51:
                Places places = new Places();
                System.out.println("Input number");
                try {
                    places.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 52:
                PowerOf2 powerOf2 = new PowerOf2();
                System.out.println("Input quantity");
                try {
                    powerOf2.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 53:
                PowerOfX powerOfX = new PowerOfX();
                System.out.println("Input base, power index and quantity");
                try {
                    powerOfX.result(sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 54:
                Pascal pascal = new Pascal();
                System.out.println("Input quantity ");
                try {
                    pascal.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 55:
                Square1 square1 = new Square1();
                System.out.println("Input quantity ");
                try {
                    square1.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 56:
                Square2 square2 = new Square2();
                System.out.println("Input quantity ");
                try {
                    square2.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 57:
                Square2rev square2rev = new Square2rev();
                System.out.println("Input quantity ");
                try {
                    square2rev.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 58:
                Pyramid1 pyramid1 = new Pyramid1();
                System.out.println("Input quantity ");
                try {
                    pyramid1.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 59:
                Pyramid1rev pyramid1rev = new Pyramid1rev();
                System.out.println("Input quantity ");
                try {
                    pyramid1rev.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 60:
                Pyramid2 pyramid2 = new Pyramid2();
                System.out.println("Input quantity ");
                try {
                    pyramid2.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 61:
                Pyramid2rev pyramid2rev = new Pyramid2rev();
                System.out.println("Input quantity ");
                try {
                    pyramid2rev.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 62:
                Password password = new Password();
                try {
                    password.result(sc);
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 63:
                PrevOdd prevOdd = new PrevOdd();
                System.out.println("Input number");
                try {
                    prevOdd.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 64:
                Pyramid pyramid = new Pyramid();
                System.out.println("Input size piramid, quantity row&col for delete");
                try {
                    pyramid.result(sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 65:
                Base base = new Base();
                System.out.println("Input number and system");
                try {
                    base.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 66:
                Base2 base2 = new Base2();
                System.out.println("Input number and system");
                try {
                    base2.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 67:
                IsSorted isSorted = new IsSorted();
                System.out.println("Input five number for checking if is sorted");
                try {
                    isSorted.result(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 68:
                Prime prime = new Prime();
                System.out.println("Input number");
                try {
                    prime.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 69:
                DivMN divMN = new DivMN();
                System.out.println("Input range two number and two dividers");
                try {
                    divMN.result(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 70:
                Abcz1 abcz1 = new Abcz1();
                System.out.println("Input number");
                try {
                    abcz1.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 71:
                NextMultiple nextMultiple = new NextMultiple();
                System.out.println("Input divisible, divisor");
                try {
                    nextMultiple.result(sc.nextInt(), sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 72:
                File fileOut = new File("task.out");
                int arr[] = {10, 20, 30, 40};

                try {
                    ArrayPrint.arrayPrint(fileOut, arr);
                } catch (InputMismatchException | IOException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 73:
                File fIn = new File("task.in");
                File fOut = new File("task.out");
                try {
                    Array.array(fIn, fOut);
                } catch (InputMismatchException | IOException e) {
                    System.err.println("Invalid format number");
                }
                break;

            case 74:
                File fInFrob = new File("task.in");
                File fOutFrob = new File("task.out");
                Frob frob = new Frob();
                frob.result(fInFrob,fOutFrob);
                break;

            case 75:
                PowerOf2Bitwise powerOf2Bitwise = new PowerOf2Bitwise();
                System.out.println("Input power number - exponent ");
                try {
                    powerOf2Bitwise.result(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.err.println("Invalid format number");
                }
                break;

            default:
                System.err.println("Wrong task number!");
                break;
        }
        sc.close();
    }
}
