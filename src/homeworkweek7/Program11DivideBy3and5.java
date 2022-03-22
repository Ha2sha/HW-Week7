/*
Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
package homeworkweek7;

public class Program11DivideBy3and5 {
    public static void main(String[] args) {
        System.out.println("Numbers divided by 3 are: ");
        for (int i = 0; i <= 100; i++) //loop until i reaches 100
        {
            if (i % 3 == 0)//if remainder zero than it is divisible by 3
            {
                System.out.print(i + "\t");//displays all now which are divisible by 3 from 1 to 100
            }
        }

        System.out.println("\nNumbers divided by 5 are: ");
        for (int i = 0; i <= 100; i++)//loop until i reaches 100
        {
            if (i % 5 == 0)//if remainder zero than it is divisible by 5
            {
                System.out.print(i + "\t");//displays all now which are divisible by 5 from 1 to 100
            }
        }
    }
}
