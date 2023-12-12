//6.	In above program with user input and without using third variable.

import java.util.Scanner;
public class q6{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a, b;                                                 //Initialization of variables
        System.out.println("Enter the first number: ");         
        a = s.nextInt();                                          //Taking integer as an input read by next.Int function
        System.out.println("Enter the second number: ");
        b = s.nextInt();                                          //Taking integer as an input read by next.Int function

        System.out.println("The First variable before the swap:        "+a);  //Printing the first variable before swapping
        System.out.println("The Second variable before the swap:       "+b);  //Printing the second variable before swapping

        //Swaapping of variables without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(" ");
        System.out.println("The First variable after the swap:         "+a);  //Printing the first variable after swapping
        System.out.println("The Second variable after the swap:        "+b);  //Printing the second variable after swapping
    }
    
}
