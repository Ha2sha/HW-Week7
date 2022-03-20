/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
if any other alphabet should be invalid entry
 */
package homeworkweek7;

import java.util.Scanner;

public class Program08City {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");

        char city = scr.next().charAt(0);//reads 1st alphabet

        if (city == 'a') {
            System.out.println("Ahmedabad");
        } else if (city == 'b') {
            System.out.println("Baroda");
        } else if (city == 'c') {
            System.out.println("Chennai");
        } else if (city == 'd') {
            System.out.println("Delhi");
        } else if (city == 'e') {
            System.out.println("Erode");
        } else if (city == 'f') {
            System.out.println("Firozabad");
        } else {
            System.out.println("Invalid Entry");
        }

    }
}
