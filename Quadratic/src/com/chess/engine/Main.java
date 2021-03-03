package com.chess.engine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b*b - 4*a*c;
        double x1, x2;
        if(d>=0){
             x1 = (-b+Math.sqrt(d))/2*a;
             x2 = (-b-Math.sqrt(d))/2*a;
            System.out.println("Root 1: " + x1 + "and" + "root 2: "+ x2);
        }
        else if(d==0){
            x1 = x2 = -b/2*a;
            System.out.println("Root 1: "+ x1);
            System.out.println("Root 2: "+ x2);
        }
        else
            System.out.println("There is no real root");

    }
}
