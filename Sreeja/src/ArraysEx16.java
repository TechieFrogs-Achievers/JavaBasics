public class ArraysEx16 
{
    public static void main(String[] args) 
    {
        int arr[]={3,56,784,2,56};          //initializing the array

        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])           //condition to check the smallest
                {
                    temp=arr[i];            //if it is true swaping of two numbers
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }

        //print the values

        System.out.println("The third largest number is"+arr[arr.length-3]);
        System.out.println("the second largest number is "+arr[arr.length-2]);
        System.out.println("The second smallest number is "+arr[1]);
    }
}
