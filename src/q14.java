//14.	Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class q14{
    public static void main(String args[]){
        System.out.print("Numbers between 1 and 100 which are divisible by 3:       ");
        
        //Loop to find numbers which are divisible by 3
        for(int i=1; i<=100; i++)
        {
            if(i%3==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Numbers between 1 and 100 which are divisible by 5:       ");

        //Loop to find numbers which are divisible by 5
        for(int i=1; i<=100; i++)
        {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Numbers between 1 and 100 which are divisible by 3 and 5: ");

        //Loop to find numbers which are divisible by 3 and 5
        for(int i=1; i<=100; i++)
        {
            if((i%3==0) && (i%5==0))
            {
                System.out.print(i+" ");
            }
        }
    }
}
