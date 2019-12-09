package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {

    private int a, b;

    public void counting() {
        System.out.println("Enter a number: ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.println("Counting from " + getA() + " to 100.");
        for (int i = getA(); i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void minusCount() {
        System.out.println("Enter another number: ");
        Scanner sc2 = new Scanner(System.in);
        a = sc2.nextInt();
        System.out.println("Counting from " + getA() + " to -100");
        for (int i = getA(); i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void nrBetween() {
        System.out.println("Enter two numbers:");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        a = sc1.nextInt();
        b = sc2.nextInt();
        System.out.println("Coounting from " + getA() + " to " + getB() + ":");
        for (int i = getA(); i <= getB(); i++) {
            System.out.println(i);
        }
    }

    public void biggestNr() {
        System.out.println("Enter two numbers: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        a = sc1.nextInt();
        b = sc2.nextInt();
        if (a < b) {
            System.out.println("Counting from " + getA() + " to " + getB() + ":");
            for (int i = getA(); i <= getB(); i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Counting from " + getB() + " to " + getA() + ":");
            for (int i = getB(); i <= getA(); i++) {
                System.out.println(i);
            }
        }
    }

    public void even() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public void odd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public int sumFrom() {
        int sum = 0;
        System.out.println("Enter a number: ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        for (int i = getA(); i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double average() {
        double sum = 0, avr = 0;
        System.out.println("Enter a number: ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        for (int i = getA(); i <= 100; i++) {
            sum = sum + i;
        }
        avr = (sum / (100 - getA() + 1));
        return avr;
    }

    public void pattern() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i= rows-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
