package Arrays;
import java.util.*;
public class RemoveDuplicate // class for printing remove duplicate values for the array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt(); 
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++)//for loop for storing array elements
        {
           arr[i]=sc.nextInt();
        } 
        for(int i=0;i<arr.length;i++)// for loop for removing duplicate elements in the array
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=0;k<arr.length-1;)
                {
                  if(arr[i]==arr[j]) //if array having duplicate element the remove the element by adding next element to previous index 
                  {
                    arr[k]=arr[k+1];
                    length=length-1;
                  }
                  else{ //else increment the j
                      j++;
                  }
                }
            }
        }
           
        for(int i=0;i<arr.length;i++)// for loop for printing the array elements
            {
                System.out.println(arr[i]);
            }
            sc.close();//scanner class close
        }
        
    }
