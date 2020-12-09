import java.util.Arrays;
public class ArraysEx23 
{
    public static void main(String[] args)
     {
        int arr[]={45464,45,256,1,4,5,698};     //initializing the array

        Arrays.sort(arr);           //using sort() method to sort the elements in ascending order

        System.out.println("Sorted in ascending order");

        for(int i=0;i<arr.length;i++)           //loop to print the array
        {
            System.out.print(" "+arr[i]);
        }

    }
}
