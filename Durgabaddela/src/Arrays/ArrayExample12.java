
import java.util.Scanner;

public class ArrayExample12
{
   public static void main(String[] args)
   {
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of the array");
    int n = sc.nextInt();//taking length from keyboard
    int arr[] = new int[n];//passing length to array
    System.out.println("enter the array elements");
    for(int i=0; i< arr.length; i++) {
        arr[i] = sc.nextInt();
        sum = sum + arr[i];
    }
    System.out.println("the sum of array elemennts ="+sum);
    sc.close();
   } 
}
