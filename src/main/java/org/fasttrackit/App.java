package org.fasttrackit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int nr1, nr2, calc;
        double n1, n2, calc2;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        if (input.hasNextInt()) {
            nr1 = input.nextInt();
            nr2 = input.nextInt();

            Sum add = new Sum();
            calc = add.sum(nr1, nr2);
            System.out.println("The sum of the two numbers is: " + calc);

            Substract sub=new Substract();
            calc=sub.sub(nr1,nr2);
            System.out.println("The substraction of the two numbers is: " + calc);

            Product prod=new Product();
            calc = prod.prod(nr1,nr2);
            System.out.println("The product of the two numbers is: " + calc);

            Division div=new Division();
            calc=div.div(nr1,nr2);
            System.out.println("The division of the two numbers is: " + calc);

            Modulo mod=new Modulo();
            calc= mod.mod(nr1,nr2);
            System.out.println("The modulo of the two numbers is: " + calc);



        } else if (input.hasNextDouble()) {
            n1 = input.nextDouble();
            n2 = input.nextDouble();

            Sum add2 = new Sum();
            calc2 = add2.sum(n1, n2);
            System.out.println("The sum of the two numbers is: " + calc2);

            Substract sub=new Substract();
            calc2=sub.sub(n1,n2);
            System.out.println("The substraction of the two numbers is: " + calc2);

            Product prod=new Product();
            calc2 = prod.prod(n1,n2);
            System.out.println("The product of the two numbers is: " + calc2);

            Division div=new Division();
            calc2=div.div(n1,n2);
            System.out.println("The division of the two numbers is: " + calc2);

            Modulo mod=new Modulo();
            calc2= mod.mod(n1,n2);
            System.out.println("The modulo of the two numbers is: " + calc2);
        }



    }
}
