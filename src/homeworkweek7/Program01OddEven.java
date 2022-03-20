/*Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
package homeworkweek7;

import java.util.Scanner;//import Scanner class

public class Program01OddEven {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created object of Scanner class
        System.out.println("Enter any number to test: ");

        int a = scr.nextInt();//reads user input from console and assign to variable a

        String result = a % 2 == 0 ? "Even" : "Odd";//ternary operator to check number is even or odd

        System.out.println(a + " is " + result + " number.");//result shows number is odd or even based on user input
    }
}
