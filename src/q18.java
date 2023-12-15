//18.	Write a Java program that accepts two integer values from the user and returns the largest value. However, if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.

import java.util.Scanner;
public class Q18 {
    public static void main(String args[]){
        //Scanner definition
        Scanner s = new Scanner(System.in);   
        
        //Taking input of integer numbers 
        System.out.print("Enter first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter second number: ");
        int n2 = s.nextInt();

        //To return the largest value
        if(n1>n2)
        {
            System.out.println("The largest number is:   "+n1);
        }
        else if(n1 < n2)
        {
            System.out.println("The largest number is:   "+n2);
        }
        else
        {
            System.out.println("0");
        }

        //Finding the remainder for both the number when it is divided with 6
        int k = n1%6; 
        int l = n2%6;

        //To return the smallest number
        if(k == l)
        {
            if(n1>n2)
            {
                System.out.println("The smallest number is:   "+n2);
            }
            else
            {
                System.out.println("The smallest number is:   "+n1);
            }
        }
    }
}
