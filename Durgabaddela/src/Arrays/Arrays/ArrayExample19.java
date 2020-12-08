package Arrays;

public class ArrayExample19
{
    public static void main(String[] args)
    {
        int temp = 0;
    int arr[] = {4,23,12,43,21,24};//array declaration and initialization
    System.out.println("the elements of an array are ");    
     for (int i = 0; i < arr.length; i++)
    {     
        System.out.print(arr[i] + " ");//printing the array elements    
    }  
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[i]>arr[j])
            {
                temp = arr[i]; //swapping elements 
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
    }
    System.out.println();
    System.out.println("The 2nd Smallest Number in given  array ="+arr[1]);
    }
}
