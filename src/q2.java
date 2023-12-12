//1.	Write a Java program to print the sum of two numbers, subtraction, multiplication, division by taking input from user.

import java.util.Scanner;                
public class q2{
    public static void main(String args[]){
        int a, b;
        Scanner s = new Scanner(System.in);       //Scanner definition 
        a = s.nextInt();                          //Taking integer as an input read by next.Int function  
        b = s.nextInt();                          //Taking integer as an input read by next.Int function  
        System.out.println("Addition of two number:        "+ (a+b));          //Printing the output for Addition of two variables
        System.out.println("Subraction of two number:      "+ (a-b));          //Printing the output for Subraction of two variables
        System.out.println("Division of two number:        "+ (a/b));          //Printing the output for Division of two variables
        System.out.println("Multiplication of two number:  "+ (a*b));          //Printing the output for Multiplication of two variables
        
    }
}
