package Arrays;

public class ArrayExample15 
{
    public static void main(String[] args) 
    {
    int temp = 0;
    int arr[] = {3,5,34,21,45,66,36};//array declaration and initialization
    System.out.println("the elements of an array are ");    
     for (int i = 0; i < arr.length; i++)
    {     
        System.out.print(arr[i] + " ");    
    }  
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[i]<arr[j])
            {
                temp = arr[i]; //swapping elements 
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
    }
    System.out.println("the array elements in decending order");
    for(int k=0; k<arr.length; k++)
    {
        System.out.print(arr[k]+" ");//the elements in decending order
    }
    System.out.println();
}

}
