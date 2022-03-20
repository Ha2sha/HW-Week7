/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format _______________________________ |
*/
package homeworkweek7;

import java.util.Scanner;

public class Program05SalarySlip {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Name: ");//Harsha
        String eName=scr.nextLine();
        System.out.println("Enter Employee ID: ");//2654
        int eID=scr.nextInt();
        System.out.println("Enter Basic Salary: ");//25000
        int eSalary=scr.nextInt();
        double gross= eSalary+(eSalary*0.1)+(eSalary*0.08)+(eSalary*0.09)-(eSalary*0.2);

        System.out.println("-------------------------------");
        System.out.println("|         Salary Slip         |");
        System.out.println("|_____________________________|");
        System.out.println("| Employee ID       :"+eID+"     |");
        System.out.println("| Employee Name     :"+eName+"   |");
        System.out.println("|_____________________________|");
        System.out.println("| Basic Salary      :"+eSalary+"    |");
        System.out.println("| HRA 10%           :"+(eSalary*0.1)+"   |");
        System.out.println("| TA 8%             :"+(eSalary*0.08)+"   |");
        System.out.println("| DA 9%             :"+(eSalary*0.09)+"   |");
        System.out.println("| PF -20%           :"+(-eSalary*0.2)+"  |");
        System.out.println("|_____________________________|");
        System.out.println("| Gross Salary      :"+gross+"  |");
        System.out.println("|_____________________________|");
    }

}
