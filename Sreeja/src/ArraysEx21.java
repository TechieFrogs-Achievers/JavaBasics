public class ArraysEx21
 {
     public static void main(String[] args) 
     {
        int arr[] = {1,1,1,2,3};            //initializing the array

        //loop to replace the duplicatte value with 0
        //removing duplicate value
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                   arr[j] = 0;
                }
            }
        }

        //printing the array without duplicate values
        
        for(int i = 0 ; i < arr.length ; i++)
            {
                if(arr[i] != 0)
                {
                    System.out.print(" "+arr[i]);
                }
            
            }

    }
}
