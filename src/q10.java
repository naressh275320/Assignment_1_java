//10.	Write a Java program to compare two numbers. (take user input).

import java.util.Scanner;
public class Q10{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);                                          //Scanner definition
        System.out.print("Enter the First Number:                                      ");
        int a = s.nextInt();                                                         //Taking integer as an input read by next.Int function
        System.out.print("Enter the Second Number:                                     ");
        int b = s.nextInt();                                                         //Taking Octal as an input read by next.Int function

        //Comparison of two number
        if(a > b)
        {
            System.out.print("First number is greater than Second number            ");
        }
        else if(a == b)
        {
            System.out.print("First number is equal to Second number            ");
        }
        else if(a < b)
        {
            System.out.print("First number is lesser than Second number            ");
        }
    }
    
}
