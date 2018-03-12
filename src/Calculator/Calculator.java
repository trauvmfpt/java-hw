/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author Adminis
 */
import java.util.Scanner;

public class Calculator {
    static void add(int x, int y){
        System.out.println("Sum of the two numbers is " + (x+y) + ".");
    }
    static void subtract(int x, int y){
        System.out.println("Difference of the two numbers is " + (x-y) + ".");
    }
    static void multiply(int x, int y){
        System.out.println("Product of the two numbers is " + (x*y) + ".");
    }
    static void divide(int x, int y){
        if (y == 0){
            if (x == 0){
                System.out.println("It's madness.");
            } else {
                System.out.println("No number can be divided by 0.");
            }
        } else {
            System.out.println("Quotient of the two numbers is " + (x/y) + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Input first number: ");
            int a = scn.nextInt();
            System.out.println("Input second number: ");
            int b = scn.nextInt();
            System.out.println("Choose an operation:\n0. Quit\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            int c = scn.nextInt();
            switch(c){
                case 0:
                    System.out.println("Please use our service again.");
                    System.exit(0);
                case 1:
                    add(a,b);
                    continue;
                case 2:
                    subtract(a,b);
                    continue;
                case 3:
                    multiply(a,b);
                    continue;
                case 4:
                    divide(a,b);
                    continue;
                default:
                    System.out.println("Please enter a number from 1 to 4 to proceed.");
                    continue;
            }
        }
    }
}
