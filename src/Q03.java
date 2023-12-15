//3.	Write a Java program that takes a number as input and prints its multiplication table up to 10. (Hint- use Loop).

import java.util.Scanner;
public class Q03 {
    public static void main(String args[]){
        //Scanner definition 
        Scanner s = new Scanner(System.in);       

        //Taking integer as an input read by next.Int function 
        System.out.print("Enter a number to print it's multiplication table upto 10: ");
        int a = s.nextInt();      

        System.out.println("The first 10 multiplication table for the number "+a);
        for(int i=1; i<=10; i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));    //Printing the table in for loop for the first 10 multiplication of the input a
        }
    }    
}
