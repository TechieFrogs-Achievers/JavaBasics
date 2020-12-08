package Arrays;
import java.util.*;
public class ArrayExample15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//scanner class
      System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int []arr1 = new int[size];
        System.out.println("Enter the elements:"); 
        int temp=0;
        for (int i = 0; i < size; i++)//display elements
         {  
            arr1[i] = sc.nextInt();           
        } 
        //sort the elements in descending order 
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]<arr1[j])
                {
                  temp=arr1[i];
                  arr1[i]=arr1[j];
                  arr1[j]=temp;
                }
            }
        }
        System.out.println("descending order:");
        for(int i=0;i<arr1.length;i++)//display sorted elements
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
