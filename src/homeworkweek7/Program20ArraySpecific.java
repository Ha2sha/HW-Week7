/*
Write a Java program to test if an array contains a specific value.
 */
package homeworkweek7;

public class Program20ArraySpecific {

    public static boolean contains(int a[],int item)//created return type method
    {
        for (int n : a) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int a[]={2014,2010,6520,8520,1420}; // create an array

        //calls static method directly
        System.out.println(contains(a,8520));//true

        //calls static method directly
        System.out.println(contains(a,5555));//false
    }
}
