package ArrayPrograms;

public class Program14 
{
    public static void main(String[] args) 
    {
         int arr[] = {1,5,7,3,8}; 

         System.out.println("elements in an array");

         for(int i : arr)
         {
             System.out.print( i + " "); //printing array elements
         }
         System.out.println();

        for(int i = 0;i <arr.length ;i++) //loop to iterate 
        {
            for(int j = i+1 ; j <arr.length; j++)//loop to check condition
            {
                if(arr[i] > arr[j])//condition to check  smaller number
                { 
                    //swaping values
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            } 
        }  
        System.out.println("array in ascending  order ");

            for(int k : arr )
            {
                System.out.print(k + " ");//to print final array
            }
    }
    
}
