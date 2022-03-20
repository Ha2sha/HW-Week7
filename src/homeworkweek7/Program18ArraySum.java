/*
Write a Java program to sum values of an array.
 */
package homeworkweek7;

public class Program18ArraySum {
    public static void main(String[] args) {
        int sum=0;
        int a[]={10,20,30,40,50,60};

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("The sum of Array is: "+ sum);
    }
}
