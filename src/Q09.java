//9.	Write a Java program to convert an octal number to a hexadecimal number.

import java.util.Scanner;
public class Q09{
    public static void main(String args[]){
        //Scanner definition 
        Scanner s = new Scanner(System.in);

        //Taking Octal as an input read by next.Int function
        System.out.print("Enter the Octal Number:                                      ");
        int a = s.nextInt(8);
        
        //Using the toHexString() to convert Integer to String of Hexa decimal Number
        String i = Integer.toHexString(a);        
        
        //Printing the octal number for the entered binary number
        System.out.println("After converting an octal number to a hexadecimal number:          "+i);   
    }
}
