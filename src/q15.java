//15.	Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;
public class Q15{
    public static void main(String args[]){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);

        //Taking input for 3 people's age
        System.out.print("Enter the first persons age: ");
        int x = s.nextInt();
        System.out.print("Enter the second persons age: ");
        int y = s.nextInt();
        System.out.print("Enter the third persons age: ");
        int z = s.nextInt();

        int youngest=0, oldest=0;

        //Comparing values to find the youngest and oldest
        if (x >= y && x >= z)
        {
            oldest = x;
            if(y >= z)
            {
                youngest = z;
            }
            else
            {
                youngest = y;
            }
        }

        else if (y >= x && y >= z)
        {
            oldest = y;
            if(x >= z)
            {
                youngest = z;
            }
            else
            {
                youngest = x;
            }
        }
        else
        {
            oldest = z;
            if(x >= y)
            {
                youngest = y;
            }
            else
            {
                youngest = x;
            }
        }

    System.out.println("The youngest person's age among the given input is: "+youngest);
    System.out.println("The oldest person's age among the given input is: "+oldest);
    }
}
