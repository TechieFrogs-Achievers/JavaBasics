public class ArraysEx10 
{
     public static void main(String[] args) 
     {
        int arr[]={1,54,654,5648,145};      //initializing array

        int min = arr[0];               //initializing minimum with zero

        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])              //condition to check the smallest number
            {
                min=arr[i];
            }
        }
        System.out.println("the smallest number is: "+min);         //prints the min value
    }
}
