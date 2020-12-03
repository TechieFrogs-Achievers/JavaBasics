package Streams;
import java.util.*;

public class Validationsample2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the CustomerBills:");
        Scanner objsc = new Scanner(System.in);
        if(objsc.hasNextInt())
        {
            int Bills = objsc.nextInt();    //int method

            System.out.println("The Bill overflow:"); //prints the value
         
        while(Bills<=100 || Bills>=200)
        {
            Bills = objsc.nextInt(); 
            System.out.println("The Bill is Correct according to the requirement:");
        }
        }
        else
        {
            System.out.println("Bills are generated:");
        }
     
        objsc.close();   //scanner close
    }
}




    

