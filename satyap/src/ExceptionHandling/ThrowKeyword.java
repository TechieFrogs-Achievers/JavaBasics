package ExceptionHandling;
import java.util.*;
public class ThrowKeyword  //class using throws keyword throws exceptions
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        int i=sc.nextInt(); //datamembers
        int j=sc.nextInt();
        int data=i/j; //arithmetic exception 
        /*try{
           int  data=i/j;
        }
        catch(ArithmeticException ae)
        {
           System.out.println("Arithmetic Exception");
        }*/
        if(data<0) //if cond  is true then throw the exception and print the statement
        {
        throw new ArithmeticException("Exception"); //thow notation
        }
        else{ //else the data value is printed
            System.out.println(data);
        }
        

    }
}
