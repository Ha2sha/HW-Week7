/*
Write a Java program to calculate the average value of array elements.
 */
package homeworkweek7;

import java.util.Scanner;

public class Program19ArrayAvg {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //reading the array size
        System.out.println("Enter array Size: ");
        int size = scr.nextInt();

        //create an array
        int array[] = new int[size];

        System.out.println("Enter array elements: ");
        //reading value from user keyboard
        for (int i = 0; i < size; i++) {
            int value= scr.nextInt();
            array[i]=value;
        }
        int length =array.length;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : " + average);
    }
}
