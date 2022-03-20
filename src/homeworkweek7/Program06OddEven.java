/*
Write a java program to input any number and find out if it’s odd or even
 */
package homeworkweek7;

import java.util.Scanner;

public class Program06OddEven {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);//Created scanner class object
        System.out.println("Enter any Number: ");

        int a=scr.nextInt();//reads user input from console

        if(a%2==0) //if remainder is zero than even otherwise odd number
        {
            System.out.println(a + " is an even number.");
        }else{
            System.out.println(a + " is a odd number.");
        }
    }
}
