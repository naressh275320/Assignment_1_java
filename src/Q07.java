//7.	Write a Java program to add two binary numbers and divide them. (both in different program).

import java.util.Scanner;
public class Q07{
    static public void main(String args[]){
        Scanner s = new Scanner(System.in);     //Scanner definition 
        int a,b,c,d;                            //Initialization of variables
        String i,j;
        a = s.nextInt(2);                 //Taking Binary as an input read by next.Int function
        b = s.nextInt(2);                 //Taking Binary as an input read by next.Int function

        c = a+b;                                //Addition of decimal values
        d = a/b;                                //Division of decimal values
        
        i = Integer.toBinaryString(c);          //Conversion of decimal to binary values
        j = Integer.toBinaryString(d);          //Conversion of decimal to binary values

        System.out.println("The binary value after addition of input variables: "+i);
        System.out.println("The binary value after division of input variables: "+j);
        
    }
}
