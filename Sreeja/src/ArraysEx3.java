public class ArraysEx3
 {
    public static void main(String[] args) 
    {
        int arr[] = { 1,2,3,4,5};       //initializing the array

        for(int i=0;i<arr.length;i++)       
        {
            for(int j=i+1;j<arr.length;j++)
            {
                arr[i] = arr[j];
            }
            
        }
        for(int i = 0 ; i <arr.length ; i++)
        {
            System.out.print(" "+arr[i])
        }
       
    }
}
