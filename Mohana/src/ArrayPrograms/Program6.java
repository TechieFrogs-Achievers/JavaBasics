package ArrayPrograms;

public class Program6 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};

        System.out.println("original array : ");
        for(int i : arr)
        {
            System.out.println(i);
        } 
        System.out.println("reverse order :  ");
        for(int j = arr.length-1; j >= 0 ;j--)//loop to print reverse order 
        {
           System.out.print(arr[j] + " ");    
        }
        
    }
    
}
