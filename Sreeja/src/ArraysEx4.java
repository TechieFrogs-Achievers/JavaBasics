import java.util.*;
public class ArraysEx4 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);            //create scanner class object

        System.out.println("Enter size of array");

        int size = sc.nextInt();            //read the size from user
        
        int array[] = new int[size];            //initializing array size

        System.out.println("Enter integer elements");

        for(int i=0;i<size;i++)             //loop to get array elements from user
        {
            array[i] = sc.nextInt();
        }

        //to compare elements in an array
        
        System.out.println("duplicate elements are:");

        for(int i = 0; i < size; i++) {  
            for(int j = i + 1; j < size; j++)
             {  
                if(array[i] == array[j])  
                System.out.println(" "+array[i]);  
            }  
        }  
        sc.close();
    }
}
