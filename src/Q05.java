//5.	Write a Java program to swap two variables

public class Q05{
    public static void main(String args[]){
        int a = 5, b = 8, t;                                                 //Initialization and declaration of variables
        
        System.out.println("The First variable before the swap:        "+a);  //Printing the first variable before swapping
        System.out.println("The Second variable before the swap:       "+b);  //Printing the second variable before swapping

        //Swapping of Variables
        t = a;
        a = b;
        b = t;
        
        System.out.println(" ");
        System.out.println("The First variable after the swap:         "+a);  //Printing the first variable after swapping
        System.out.println("The Second variable after the swap:        "+b);  //Printing the second variable after swapping

    }
    
}
