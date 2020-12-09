import java.util.*;
public class ArraysEx1 
{

    public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);            //creating scanner class object

        System.out.println("Enter size");       
        int size = sc.nextInt();                    //read size from user
        String arr[]= new String[size];             //get size of array

        System.out.println("Enter strings");
        for(int i = 0;i<size;i++)               //loop to get array elements from user
        {
            arr[i] = sc.next();             //read strings from user
        }
        
        System.out.println("arr[i] contains ");
        for(int i=0;i<size;i++)                 //loop to print the array elements
        {
            System.out.println(" "+arr[i]);       
         }

         String arr1[] = new String[size];          //initializing the array size
         for(int i=0;i<size;i++)                        //loop to copy all the elements of arr[i] into arr1[i]
         {
             arr1[i]=arr[i];
         }
        
        System.out.println("arr1[i] contains");
        
         for(int i=0;i<size;i++)                    //loop to print the all elements of arr1[i]
         {
            System.out.println(" "+arr[i]);
        
         }
    
         sc.close();
    }
}
