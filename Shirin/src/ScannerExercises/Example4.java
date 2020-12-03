package ScannerExercises;
import java.util.*;
public class Example4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//creating method
        //int num = sc.nextInt();// Data member
        //int num;
        System.out.println("Enter the number");
        sc.hasNextInt();// method
        int num = sc.nextInt();// Data member
        if(num%2==0)
        {
            System.out.println("The number is even");
        }
        else 
        {
            System.out.println("The number is odd");
        }
        sc.close();// closing scanner
    

        
    }
    
}
