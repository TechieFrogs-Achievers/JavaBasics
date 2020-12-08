public class Array22 
{
    public static void main(String args[])
    {
        int arr[] = {4, 6, 1, 7, 0 , 9, 8 };
        int arre[] = new int[arr.length];
        int arro[] = new int[arr.length];
        for( int i = 0; i < arr.length ; i++)
        {
            if(arr[i] % 2 == 0 )
            {
                arre[i] += arr[i];
            }
            if(arr[i] % 2 != 0)
            {
                arro[i] += arr[i];
            }
        }
        System.out.println("The even numbers in an array are : ");
        for(int i = 0 ; i < arre.length; i++)
        {
            System.out.print(arre[i]+ " ");
        }
        System.out.println("The odd numbers in an array are : ");
        for(int i = 0 ; i < arro.length; i++ )
        {
            System.out.print( arro[i] + " ");
        }
    }   
}
