package org.fasttrackit;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        int nr1=0;
        int nr2=0;
        int sum;
        int minus;
        int multiplication;
        int division;
        int modulo;

        System.out.println("Enter first number:");
        nr1=input.nextInt();
        System.out.println("Enter second number: ");
        nr2=input.nextInt();

        sum = nr1+nr2;
        System.out.println("The sum of the two numbers is: " + sum);

//        having a positive result

        if (nr1>nr2){
            minus = nr1-nr2;
            System.out.println("The subtraction of the two numbers is: " + minus);
        }
        else {
            minus = nr2 - nr1;
            System.out.println("The subtraction of the two numbers is: " + minus);
        }

        multiplication = nr1*nr2;
        System.out.println("The multiplication of the two numbers is: "+ multiplication);

        division = nr1/nr2;
        System.out.println("The division of the two numbers is: "+ division);

        modulo = nr1%nr2;
        System.out.println("The modulo result of the two numbers is: "+ modulo);



    }

}
