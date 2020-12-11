public class ArraysEx3
 {
    public static void main(String[] args) 
    {
        int arr[] = { 1,2,3,4,5};       //initializing the array
        
        int n = 1;      //no of times to rotate
        
        for(int i = 0 ; i <n ; i++)
        {
           int temp;
           int j;
           temp = arr[0];           //stores the first element in another variable
           
           //loop to left rotate the values 
           
           for( j = 0 ; j < arr.length-1 ; j++)
           {
               arr[j] = arr[j+1];
           } 
           arr[j] = temp;           //stores the temp value o last place
        }
        System.out.println();

        System.out.println("After left rotation");

        //loop to print the array
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
       
    }
}
