package ExceptionHandling; //package for ExceptionHandling
import java.util.*; //package for Scanner class
import java.io.*;//package for io 
public class NegativeArraySizeException  //class for NegativeArraySizeException
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt(); //length giving for scanner class
        
        //int b=sc.nextInt();
        //int c[]=new int[b];
        try{ //try block for negative array size exception
            int arr[]=new int[length]; //prints array value
            System.out.println("Array Length:"+(arr[length]));
        }
        catch(Exception ne)//catch block for exception 
        {
            System.out.println("Negative array size Exception"+ne);
        }
        sc.close(); //scanner close
    }
}
