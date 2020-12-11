package Arrays;
import java.util.*;
public class ArrayExample38 
{
   public static void main(String[] args) 
   {
    int sum = 0 ;
    double avg = 0 ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array : ");
    int size = sc.nextInt();
    System.out.println("Enter an array : ");
    int arr1[] = new int[size];
    for(int i = 0; i < size ; i++)//display elements
    {
        arr1[i] = sc.nextInt();
    }
    for(int i = 0; i < size ; i++)
    {
        System.out.print(arr1[i] + " ");
    }
    for(int i = 0 ; i < size ; i++)//sum of all elements
    {
        sum = sum + arr1[i];
    }
    avg = sum / size ;//average of an array
    System.out.println("The average of array is : " + avg);
    sc.close();

   } 
}
