/*
Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
package homeworkweek7;

import java.util.Scanner;

public class Program10Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        char operator;
        System.out.print("Enter A : ");
        a = s.nextInt();//reads 1st number entered by user in console
        System.out.print("Enter B : ");
        b = s.nextInt();//reads 2nd number entered by user in console
        System.out.print("Enter operator (+, -, *, /) : ");
        operator = s.next().charAt(0);//reads operator entered by user in console
        double addition = a + b;//adds 2 numbers
        double subtraction = a - b;//subtracts 2 numbers
        double multiplication = a * b;//multiply 2 numbers
        double division = a / b;//divide 1 number by the other
        if (operator == '+') //true when user enters + operator
        {
            System.out.print("Total after Addition is : " + addition);
        } else if (operator == '-') //true when user enters - operator
        {
            System.out.print("Total after Subtraction is : " + subtraction);
        } else if (operator == '*') //true when user enters * operator
        {
            System.out.print("Total after Multiplication is : " + multiplication);
        } else if (operator == '/') //true when user enters / operator
        {
            System.out.print("Total after Division is : " + division);
        } else {
            System.out.print("Please select proper operator");// if user enters any other operator than above
        }
    }
}
