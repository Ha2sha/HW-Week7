/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
package homeworkweek7;

import java.util.Scanner;

public class Program16Number {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created scanner class
        System.out.println("Enter any number: ");
        int num = scr.nextInt();//reads user input from console
        if (num > 0) {
            System.out.println("Number is Positive.");
        } else if (num < 0) {
            System.out.println("Number is Negative.");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
