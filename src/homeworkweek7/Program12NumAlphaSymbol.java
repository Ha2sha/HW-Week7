//Write a program that tells us input value is number or an alphabet or symbol.

package homeworkweek7;

import java.util.Scanner;

public class Program12NumAlphaSymbol {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);//created scanner object
        System.out.println("Enter any Character: ");
        char ch=scr.next().charAt(0);//reads char at 0 position from user input

        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println(ch + " is an Alphabet.");
        } else if((ch>='0' && ch<='9')){
            System.out.println(ch + " is a Number.");
        }else{
            System.out.println(ch + " is a Symbol.");
        }

    }
}
