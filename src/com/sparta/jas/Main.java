package com.sparta.jas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1 = 1;
        int n2 = 5;
        int n3 = 9;
        int n4 = 3;
        int n5 = 0;
        Factorial factorial = new Factorial();
        long f1 = factorial.getFact(1);
        long f2 = factorial.getFact(5);
        long f3 = factorial.getFact(9);
        long f4 = factorial.getFact(3);
        long f5 = factorial.getFact(0);
        System.out.println(n1 + "! = " + f1);
        System.out.println(n2 + "! = " + f2);
        System.out.println(n3 + "! = " + f3);
        System.out.println(n4 + "! = " + f4);
        System.out.println(n5 + "! = " + f5);
    }
}
