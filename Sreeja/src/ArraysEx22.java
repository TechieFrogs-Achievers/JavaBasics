public class ArraysEx22 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};        //initializing the array

        System.out.println("Even numbers are:");

        //loop to for even numbers

        for(int i=0;i<arr.length;i++)       
        {
            if(arr[i]%2==0)             //condition to check even numbers
            {
                System.out.print(" "+arr[i]);
            }
        }
        System.out.println();
        System.out.println("Odd numbers are:");

         //loop for odd numbers

        for(int i=0;i<arr.length;i++)       //condition to check odd numbers   
        {
            if(arr[i]%2!=0)
            {
               System.out.print(" "+arr[i]); 
            }
        }
    }
}
