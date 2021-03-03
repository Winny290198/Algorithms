package com.chess.engine;

import java.util.Scanner;

import static java.lang.Integer.min;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an integer a: ");
	int a = scanner.nextInt();
	System.out.println("Enter an integer b: ");
        int b = scanner.nextInt();
	System.out.println("gcd(" + a + "," + b + ")= " + Euclid1(a,b));
	System.out.println("gcd(" + a + "," + b + ")= " + Euclid2(a,b));
	System.out.println("Consecutive(" + a + "," + b + ")= " + Consecutive(a,b));


    }

    public static int Euclid1(int a, int b){
        while(b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static int Euclid2(int a, int b){
        if(b==0){return a;}
        else
            return Euclid2(b,a%b);
    }

    public static int Consecutive(int a, int b){
        int c = min(a,b);
        while(c>0){
            if (a%c == 0 && b%c == 0){return c;}
            c = c-1;
        }
        if(b==0){return a;}
        return 1;
    }
}
