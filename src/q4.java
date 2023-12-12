//4.	Write a Java program to print the area and perimeter of a rectangle. (use user input).

import java.util.Scanner;
public class q4 {
    public static void main(String args[]){
        int l,b;
        Scanner s = new Scanner(System.in);                       //Scanner definition 
        System.out.println("Enter the length of the Rectangle: ");
        l = s.nextInt();                                          //Taking integer as an input read by next.Int function 
        System.out.println("Enter the bredth of the Rectangle: ");
        b = s.nextInt();                                          //Taking integer as an input read by next.Int function 
        int a = 0, p = 0;
        a = l*b;
        p = 2*(l+b);
        System.out.println("Area of the rectangle for the given input is:                "+a);  //Printing the area of rectangle calculated by given input
        System.out.println("Perimeter of the rectangle for the given input is:           "+p);  //Printing the perimeter of rectangle calculated by given input
    }
}
