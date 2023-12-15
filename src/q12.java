//12.	Write a Java program to print the ASCII value of a given character.

import java.util.Scanner;
public class Q12{
    public static void main(String args[]){
        //Scanner definition
        Scanner s = new Scanner(System.in);                                    

        //Taking character as an input read by next().charat(0) function
        System.out.print("Enter Character:   ");
        char a = s.next().charAt(0);                                     
        
        //Widening Type casting
        int as = a; 
        System.out.println("The ASCII value for the given character '" + a + "' is: " + as);
    }
}
