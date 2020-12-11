package Arrays;
import java.util.*;
public class SecondElement 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++) // storing elements in array
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int temp;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second element:"+arr[arr.length-2]);// print third element from array
        sc.close();
    }
}
