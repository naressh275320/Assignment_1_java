/*Scenario: -  
There is one hotel owner who have to designee a menu for this hotel. 
Hotels have VEG, NOVEG section and Beverages.
Each Veg, non-Veg section and Beverages have 3-3 items. (programmers-chose items as you wish).
TASK: -
Take user ordered as per user wish.
There must be one option for no order.
*/

import java.util.Scanner;
public class Q20 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);                                 //Scanner definition
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[3];
        int aq[] = new int[3];
        int bq[] = new int[3];
        int cq[] = new int[3];
        char F = 'Y';
        int g = 0;
        do{           // Do while is used because it can be run again and it will be runned one time for sure
            System.out.println(); 
            System.out.println("*******************************************DIVINE RESTAURANT MENU*******************************************");
            System.out.print("Enter the number for the section from which you want to order. 1)Veg, 2)Non-Veg, 3)Beverages, 4)No Order: ");
            int n = s.nextInt();   
            if(n==1)
            {
                System.out.print("Enter the number. 1) Ghee Roast, 2) Fried Rice, 3)Parotta, 4)None: ");
                int t = s.nextInt();
                if(t != 4){
                    t--;
                    a[t] = 1;
                    System.out.print("Enter the number of quantity: ");
                    int m = s.nextInt();
                    aq[t] = aq[t]+m;          //Increasing the quantity
                }
                g=1;
            }
            else if(n==2)
            {
                System.out.print("Enter the number. 1) Chicken Biriyani, 2) Egg Noodles, 3)Kabab, 4)None: ");
                int p = s.nextInt();
                if(p != 4){
                    p--;
                    b[p] = 1;
                    System.out.print("Enter the quantity: ");
                    int r = s.nextInt();
                    bq[p] = bq[p]+r;
                }
                g=1;
            }
            else if(n==3)
            {
                System.out.print("Enter the number. 1)Lemon mocktail, 2) Watermelon Juice, 3)Oreo Milkshake, 4)None: ");
                int v = s.nextInt();
                if(v != 4){ 
                    v--;
                    c[v] = 1;
                    System.out.print("Enter the quantity: ");
                    int q = s.nextInt();
                    cq[v] = cq[v]+q;
                }
                g=1;
            }
            else
            {
                F = 'N';
                
            }
        if(F == 'Y'){
            System.out.println("Do you want to order another dish?(Y/N): ");
            F = s.next().charAt(0);
        }
        

            
        }while(F == 'Y');          
        
        System.out.println(); 
        if(g==1){
            System.out.println("Let me repeat the order: ");
            System.out.println("Dish                   Quantity");
        }
        
        if(a[0] == 1)
        {
            System.out.println("Ghee Roast -             "+ aq[0]);
        }
        if(a[1] == 1)
        {
            System.out.println("Fried Rice -             "+ aq[1]);
        }
        if(a[2] == 1)
        {
            System.out.println("Parotta -                "+ aq[2]);
        }
        if(b[0] == 1)
        {
            System.out.println("Chicken Biriyani -       "+ bq[0]);
        }
        if(b[1] == 1)
        {
            System.out.println("Egg Noodles -            "+ bq[1]);
        }
        if(b[2] == 1)
        {
            System.out.println("Kabab -                  "+ bq[2]);
        }
        if(c[0] == 1)
        {
            System.out.println("Lemon mocktail -         "+ cq[0]);
        }
        if(c[1] == 1)
        {
            System.out.println("Watermelon Juice -       "+ cq[1]);
        }
        if(c[2] == 1)
        {
            System.out.println("Oreo Milkshake -         "+ cq[2]);
        }
        System.out.println(); 
        System.out.println("Thank You! Visit again");
    }
}
