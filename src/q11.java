//11.	Write a Java program to count letters, spaces, numbers and other characters in an input string.

import java.util.Scanner;
public class Q11{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);                                          //Scanner definition
        String str = s.nextLine();
        int l=0, d=0, sp=0, o=0;                                                     //Declaration of variables for counting purpose
        char[] ch = str.toCharArray();
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isLetter(ch[i]))
            {
                l++;
            }
            else if(Character.isDigit(ch[i]))
            {
                d++;
            }
            else if(Character.isSpaceChar(ch[i]))
            {
                sp++;
            }
            else
            {
                o++;
            }
        }
        // Display the original string
        System.out.println("The string is : " + str );
        
        // Display the counts of letters, digits, spaces, and other characters
        System.out.println("Letter:    " + l);
        System.out.println("Number:    " + d);
        System.out.println("Space:     " + sp);
        System.out.println("Other:     " + o);

        
    }
    
}
