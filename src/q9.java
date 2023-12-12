//9.	Write a Java program to convert an octal number to a hexadecimal number.

import java.util.Scanner;
public class q9{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);     //Scanner definition 
        System.out.print("Enter the Octal Number:                                      ");
        int a = s.nextInt(8);                 //Taking Octal as an input read by next.Int function
        String i = Integer.toHexString(a);        //Using the toHexString() to convert Integer to String of Hexa decimal Number
        System.out.println("The binary value after addition of input variables:          "+i);   //Printing the octal number for the entered binary number
    }
    
}
