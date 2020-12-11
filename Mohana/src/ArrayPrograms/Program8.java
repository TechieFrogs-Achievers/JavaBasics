package ArrayPrograms;

public class Program8 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};

         System.out.println("given elements");

         for(int i : arr)
         {
             System.out.print(i + " ");
         } 
         System.out.println(); 

         System.out.println("even elements in an array");
         for(int j = 0 ; j < arr.length; j++)
         {  
             if(j%2 != 0)//condition to check odd position
             {
               System.out.print(arr[j] + " ");
             }
         }
        
    }
    
}
