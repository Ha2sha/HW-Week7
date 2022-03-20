/*
Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
(marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
And print Mark Sheet in following format
 */
package homeworkweek7;

import java.util.Scanner;

public class Program03MarkSheet {

    public static void show(int a) //method to check if marks input are valid or not
    {
        if (a < 0 || a > 100)
            System.out.println("Invalid Input, Marks should between 0 to 100");
    }

    public static int total(int a, int b, int c) //method gives total of all subjects
    {
        int total = a + b + c;
        return total;
    }

    public static void main(String[] args) {
        String sName;
        int rollNo, maths, science, english;
        int total, percentage;

        Scanner scr = new Scanner(System.in);//created object of scanner class
        System.out.println("Enter Student Name: ");//Jay
        sName = scr.nextLine();//reads user defined string input
        System.out.println("Enter Roll Number: ");//8
        rollNo = scr.nextInt();//reads user defined integer input
        System.out.println("Enter Maths Marks: ");//95
        maths = scr.nextInt();//reads user defined integer input
        show(maths);
        System.out.println("Enter Science Marks: ");//96
        science = scr.nextInt();//reads user defined integer input
        show(science);
        System.out.println("Enter English Marks: ");//92
        english = scr.nextInt();//reads user defined integer input
        show(english);

        int a = total(maths, english, science);//calls method named total
        double b = (total(maths, english, science) / 3);//average of marks

        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|            Mark Sheet          |");
        System.out.println("|________________________________|");
        System.out.println("|      Name       :     " + sName + "      |");
        System.out.println("|      Roll No    :     "+ rollNo + "        |");
        System.out.println("|________________________________|");
        System.out.println("|________________________________|");
        System.out.println("|      Subject    :     Marks    |");
        System.out.println("|      Maths      :     " + maths + "       |");
        System.out.println("|      English    :     " + english + "       |");
        System.out.println("|      Science    :     " + science + "       |");
        System.out.println("|________________________________|");
        System.out.println("|      Total      :     " + a + "      |");
        System.out.println("|________________________________|");
        System.out.println("|      Percentage :     " + b + "     |");

        if (b >= 35) {
            System.out.println("|      Result     :     Pass     |");
        } else {
            System.out.println("|      Result     :     Fail      |");
        }

        if (b >= 80) {
            System.out.println("|     Grade       :     A+       |");
        } else if (b >= 60 && b < 70) {
            System.out.println("|     Grade       :     A        |");
        } else if (b >= 50 && b < 60) {
            System.out.println("|     Grade       :     B        |");
        } else if (b >= 35 && b < 50) {
            System.out.println("|     Grade       :     C        |");
        } else {
            System.out.println("|     Grade       :     Fail     |");
        }
        System.out.println("|________________________________|");

    }
}
