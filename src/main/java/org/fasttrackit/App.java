package org.fasttrackit;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        int nr1;
        int nr2;
        int calc;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        nr1=input.nextInt();
        System.out.println("Enter second number: ");
        nr2=input.nextInt();

        Sum add=new Sum();
        calc=add.sum(nr1,nr2);
        System.out.println("The sum of the two numbers is: " +  calc);

        Substract sub=new Substract();
        calc=sub.sub(nr1,nr2);
        System.out.println("The substraction of the two numbers is: "+ calc);

        Product prod= new Product();
        calc=prod.prod(nr1,nr2);
        System.out.println("The product of the two numbers is: "+ calc);

        Division div=new Division();
        calc=div.div(nr1,nr2);
        System.out.println("The division of the two numbers is: "+calc);

        Modulo mod = new Modulo();
        calc= mod.mod(nr1,nr2);
        System.out.println("The modulo result of the two numbers is "+calc);

    }


}
