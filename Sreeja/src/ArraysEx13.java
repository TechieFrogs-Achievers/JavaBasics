public class ArraysEx13 
{
     public static void main(String[] args) 
     {
        int arr[] = {1,2,3,4,5};        //initialize array

        int n = 1;                  //no of times to rotate

        //loop to rotate the elements
        
        for(int i = 0 ; i < n ; i++)
        {
        int j;
        int last = arr[arr.length-1];
        for( j = arr.length-1 ; j > 0 ; j-- )
        {
            arr[j] = arr[j-1];      //replace the elements with right index
        }
        arr[j] = last;          //stores the last element in the first
        }
        System.out.println();

        System.out.println("After right rotation");

        //loop to print the array
       
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }

    
    }
}
