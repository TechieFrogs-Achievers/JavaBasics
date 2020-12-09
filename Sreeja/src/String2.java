import java.util.*;
public class String2 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);        //create scanner class object

        System.out.println("Enter size of array");

        int size= sc.nextInt();         //read from the user

        String arr[]= new String[size];     //creating object for array

        System.out.println("Enter strings");

        for(int i =0;i<=size;i++)
        {
            arr[i]=sc.next();           //initializing array  
        }
        
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();








        }
}
