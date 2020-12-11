package Arrays;
import java.util.*;
public class ArrayValueContains  // class for printing whether the number is present in array or not
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt();
        int arr[]=new int[length]; //array notation
        int toFind=5; //var for find number
        boolean found=false; //flag value
        for(int i=0;i<arr.length;i++) // for loop for storing array elements
        {
            arr[i]=sc.nextInt();
        }
        for(int n:arr) //for each loop for stroing the arr values into n
        {
            if(n==toFind) //if the find value is found then flag as true and break 
            {
              found=true;
              break;
            }
        }
        if(found) //found is true then print element is found
        {
            System.out.println(toFind+" "+"is found");
        }
        else{ // if not then print not found
            System.out.println(toFind+" "+"is not found");
        }
        sc.close(); //scanner close

    }
}
