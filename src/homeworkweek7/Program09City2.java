/*
Input any alphabet from âA" to âFâ and print their city name accordingly (use switch statement)
 if any other alphabet should be invalid entry
 */
package homeworkweek7;

import java.util.Scanner;

public class Program09City2 {

    public static char lowerCase(char c){
        char ch= Character.toLowerCase(c);//converts character to lowercase
        return ch;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");

        char city = scr.next().charAt(0);//reads 1st alphabet

        switch (lowerCase(city)) {
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Erode");
                break;
            case 'f':
                System.out.println("Firozabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }
}
