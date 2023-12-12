//8.	Write a Java program to convert a binary number to an octal number.

import java.util.Scanner;
public class q8{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);     //Scanner definition 
        System.out.print("Enter the binary Number:                                      ");
        int a = s.nextInt(2);                 //Taking Binary as an input read by next.Int function
        String i = Integer.toOctalString(a);        //Using the toOctalString() to convert Integer to String of Octal Number
        System.out.println("The binary value after converting it into octal number:          "+i);   //Printing the octal number for the entered binary number
    }
    
}
