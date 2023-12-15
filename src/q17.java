//17.	Write a program on reverse star pattern.

import java.util.Scanner;

public class Q17 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);                  //Scanner definition
        System.out.print("Enter number of line for the star pattern: ");
        int n= s.nextInt();
        
        //Loop to iterate for the given number of rows 
        for (int i = n; i >= 1; i--) { 
  
            //Loop to print the number of spaces before the star 
            for (int j = n; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            //Loop to print the number of stars in each row 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            //For new line after printing each row 
            System.out.println(); 
        }
    }
    
}
