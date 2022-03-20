/*
Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false. A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameter month and year. Both of type int.
If parameter month is < 1 or >12 return -1. If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month.
Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.
 */
package homeworkweek7;

import java.util.Scanner;

public class Program04LeapYear {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//object of scanner class
        System.out.println("Enter Year: ");
        int year = scr.nextInt();//reads year entered by user in console
        System.out.println("Leap Year: " + isLeapYear(year));
        System.out.println("Enter Month: ");
        int m = scr.nextInt();//reads month entered by user in console
        getDaysInMonth(m, year);//no.of days in specific month & year entered by user
    }

    public static void getDaysInMonth(int month, int year) {
        boolean b;
        b = isLeapYear(year);//if leap year than true

        switch (month) {
            case 1:
                System.out.println("31 days in January");
                break;
            case 2:
                if (b) {
                    System.out.println("29 days in February");
                } else {
                    System.out.println("28 days in February");
                }
                break;
            case 3:
                System.out.println("31 days in March");
                break;
            case 4:
                System.out.println("30 days in April");
                break;
            case 5:
                System.out.println("31 days in May");
                break;
            case 6:
                System.out.println("30 days in June");
                break;
            case 7:
                System.out.println("31 days in July");
                break;
            case 8:
                System.out.println("31 days in August");
                break;
            case 9:
                System.out.println("30 days in September");
                break;
            case 10:
                System.out.println("31 days in October");
                break;
            case 11:
                System.out.println("30 days in November");
                break;
            case 12:
                System.out.println("31 days in December");
                break;
            default:
                System.out.println("-1");
        }

    }

    public static boolean isLeapYear(int year) {
        boolean leap;
        if (year <= 1 || year >= 9999) //defines range of user input
        {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)//if year is divided by 4 & not century year & divided by 400 than it is a leap year
            {
                return true;
            }
            return false;
        }
    }
}
