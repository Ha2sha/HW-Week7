/*
Write a Java program to sum values of an array.
 */
package homeworkweek7;

import java.util.Scanner;

public class Program18ArraySum {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner scr =new Scanner(System.in);
        System.out.println("Enter no. of elements you want in Array: ");
        n=scr.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements:");
           for(int i=0;i<n;i++){
            a[i] =scr.nextInt();
            sum=sum+a[i];
        }
        System.out.println("The sum of Array is: "+ sum);
    }
}
