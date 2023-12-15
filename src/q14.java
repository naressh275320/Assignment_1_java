//14.	Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class Q14{
    public static void main(String args[]){
        //Loop to find numbers which are divisible by 3
        System.out.print("Numbers between 1 and 100 which are divisible by 3:       ");
        for(int i=1; i<=100; i++)
        {
            if(i%3==0)
            {
                System.out.print(i+" ");
            }
        }

        System.out.println();
        //Loop to find numbers which are divisible by 5
        System.out.print("Numbers between 1 and 100 which are divisible by 5:       ");
        for(int i=1; i<=100; i++)
        {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        
        //Loop to find numbers which are divisible by 3 and 5
        System.out.print("Numbers between 1 and 100 which are divisible by 3 and 5: ");
        for(int i=1; i<=100; i++)
        {
            if((i%3==0) && (i%5==0))
            {
                System.out.print(i+" ");
            }
        }
    }
}
