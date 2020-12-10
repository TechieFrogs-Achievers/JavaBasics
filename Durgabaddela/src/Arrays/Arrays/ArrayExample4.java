package Arrays;

public class ArrayExample4 
{
    public static void main(String[] args)
     {
        int arr[] = {4,5,6,4,32,5,34,6};//array declaration with values
        System.out.println("the duplicate elements are =");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                
            if(arr[i]==arr[j])//it checks if elements in array are equal 
            {
                System.out.println(arr[j]+" ");//printing the duplicate elements
            }
        }
        }
    }
}
