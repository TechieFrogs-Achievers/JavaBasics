public class ArraysEx2 
{
     public static void main(String[] args) 
     {
        int arr[] = {1,1,2,2,3,4};      //initialize the array
        int arr1[] = new int[arr.length];       //create another array for storing
        int seen = -1;

        //loop to find the frequency of characters
        
        for( int i = 0 ; i < arr.length ; i++)
        {
            int count = 1 ;
            for(int j = i+1; j < arr.length ; j++ )
            {
                if(arr[i]==arr[j])      //to check the equality of two characters
                {
                    arr[j] = seen ;
                    count++;
                }
            }
            //storing frequency in another array
            
            if(arr[i]!=seen)
            {
                arr1[i] = count;

            }

        }

        //loop to print the frequency of every element
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if( arr1[i]!=seen)
            {
                System.out.println("The value of "+arr[i]+"is present"+ arr1[i]+"no of times");
            }
        }
    }
}
