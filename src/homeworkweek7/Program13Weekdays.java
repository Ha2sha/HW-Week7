/*
Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
package homeworkweek7;

import java.util.Scanner;

public class Program13Weekdays {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);//created scanner object
        System.out.println("Enter Weekday no.from 1 to 7: ");
        int day = sr.nextInt();//reads user input from console
        switch (day) {
            case 1:
                System.out.println("Monday");//if day =1
                break;
            case 2:
                System.out.println("Tuesday");//if day =2
                break;
            case 3:
                System.out.println("Wednesday");//if day =3
                break;
            case 4:
                System.out.println("Thursday");//if day =4
                break;
            case 5:
                System.out.println("Friday");//if day =5
                break;
            case 6:
                System.out.println("Saturday");//if day =6
                break;
            case 7:
                System.out.println("Sunday");//if day =7
                break;
            default:
                System.out.println("Week contains 1 to 7 days");//if day is other than 1 to 7
        }
    }
}
