import java.util.*;
public class ArraysEx9 
{
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);               //create scanner class object

         System.out.println("Enter size of array");

         int size = sc.nextInt();           //read the size from user
        
         int array[]= new int[size];            //initializing array with size

         System.out.println("enter elements in an array");

         for(int i=0;i<size;i++)             //loop to get array elements from user
        {
            array[i] = sc.nextInt();        
        }

         int max =array[0];         //initializing max with 0

         for(int i=1;i<array.length;i++)        
         {
             if(max<array[i])       //condition to check the largest number
             max = array[i];
         }

         System.out.println("The largest number is:"+max);

         
        
         sc.close();
    }
}
