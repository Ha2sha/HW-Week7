/*
Write a Java program to sort a numeric array and a string array.
 */
package homeworkweek7;

import java.util.Arrays;

public class Program17SortingArray {
    public static void main(String[] args) {
        int a[]={30,20,10,80,60,5,2}; //defined & initialized integer array
        String s[]={"Harsha","Asha","Dipen","Zen","Shailesh"};//defined & initialized string array

        Arrays.sort(a);//sorts array by Asc
        System.out.println("Modified a[] : "+Arrays.toString(a));//prints modified array after sorting

        System.out.println();

        Arrays.sort(s);//sorts array by asc
        System.out.println("Modified s[] : "+ Arrays.toString(s));//prints modified array after sorting

//        for(int j=0; j<s.length;j++){
//            System.out.print(s[j]+"\t");
//        }


    }
}
