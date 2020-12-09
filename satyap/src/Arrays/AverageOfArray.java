package Arrays;
import java.util.*;
public class AverageOfArray // class for print average of array elements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt();
        int arr[]=new int[length]; //array notation
        for(int i=0;i<arr.length;i++) // for loop for stroing elements in array
        {
             arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++) // for loop for calculating sum of elemnets in array 
        {
            sum=sum+arr[i];
            
        }
        float avg=sum/arr.length; // avg of an array
        System.out.println("Average of an array:"+avg);
        sc.close(); //scanner close
    }
}
