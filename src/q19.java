//19.	Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

import java.util.Scanner;
public class Q19 {
    public static void main(String args[]){
        //Scanner definition
        Scanner s = new Scanner(System.in);                                 
        
        //Taking integer input
        System.out.print("Enter the number: ");
        int n = s.nextInt();

        //To check whether the number is divisible by 2 or not
        if(n%2==0)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
    }
}
