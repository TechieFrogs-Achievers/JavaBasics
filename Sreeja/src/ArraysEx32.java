public class ArraysEx32 
{
    public static void main(String[] args)
     {
        int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};

        //initializing variables with zeros
       
        int evenCount = 0;
        int oddCount = 0 ;

        //loop to get the frequency of evennumbers odd numbers
        
        for(int i = 0 ; i < 3; i++)
        {
            for( int j = 0 ; j < 3 ; j++)
            {
                if(arr[i][j]%2 == 0)        //to check even number
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
       
        //print the values

        System.out.println("Frequency of even numbers is "+evenCount);
        System.out.println("Frequency of odd numbers is "+oddCount);

    }
}
