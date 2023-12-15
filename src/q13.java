//13.	Write a Java program to display system time

//Import libraries for current time
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Q13{
    public static void main(String args[]){
        System.out.print("The current system time is: ");
        System.out.println(java.time.LocalTime.now());  //Displaying the System Time  
    }
    
}
