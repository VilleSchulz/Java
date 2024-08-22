//Task 1: Quadratic equation solver
//
//Write a program that prompts the user to enter the coefficients of a
// quadratic equation (ax^2 + bx + c = 0) and calculates its roots using the
// quadratic formula. Display the roots on the console. If the equation has no real roots,
// display the message "No real roots".

import java.sql.SQLOutput;
import java.util.Scanner;

public class t01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("This i program for solving roots for quadric equation (ax^2 + bx + c = 0)");
        System.out.print("Give (a)");
        double a =Double.parseDouble(in.nextLine()) ;
        System.out.print("Give (b)");
        double b =Double.parseDouble(in.nextLine()) ;
        System.out.print("Give (c)");
        double c =Double.parseDouble(in.nextLine()) ;

        double discriminant = (b*2)-(4*a*c);

        if (discriminant == 0){
            System.out.println("Equation has one root" + discriminant);}
        else if (discriminant > 0){
            System.out.println("Equation has two roots: " + discriminant + "and -" + discriminant);

        }

        else{
            System.out.println("equation has no roots");
        }
    }
}
