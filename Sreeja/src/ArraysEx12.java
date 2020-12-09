public class ArraysEx12 
{
      public static void main(String[] args) 
      {
         int arr[] = {1,2,3,4,5,6,7,8,9};           //initializing the array

        int sum = 0;

         for(int i=0;i<arr.length;i++)          //loop to to add the all elements in ana array
         {
            sum = sum + arr[i];
         }

         System.out.println("Sum of all elements in an array is :"+sum);
     }

}
