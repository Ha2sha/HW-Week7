/*
Write a Java program to calculate the average value of array elements.
 */
package homeworkweek7;

public class Program19ArrayAvg {
    public static void main(String[] args) {
        // create an array
        int[] array = { 10, 20, 30, 40, 50, 60 };

        // getting array length
        int length = array.length;

        // default sum value.
        int sum = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : "+average);
    }
}
