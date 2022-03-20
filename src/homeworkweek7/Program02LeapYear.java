/*Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

package homeworkweek7;

import java.util.Scanner;//import Scanner class

public class Program02LeapYear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created object of Scanner class
        System.out.println("Enter year to test: ");
        int year = scr.nextInt();//reads user input from console & assign to variable year

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //if year is divided by 4 & not a century year & divided by 400 than it is a leap year
        {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");

        }
    }
}

