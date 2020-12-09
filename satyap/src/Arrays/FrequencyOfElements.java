package Arrays;
//import java.util.*;
public class FrequencyOfElements  // Class for calculating frequency of elements 
{
    public static void main(String[] args)
    {      
        //Scanner sc=new Scanner(System.in);
        //int length=sc.nextInt();
        //int arr[]=new int[length];  
        int arr[]=new int[]{1,3,4,5,6,2,4,5,2,4}; //array of int type
        int freq[]=new int[arr.length]; 
        for(int i=0;i<arr.length;i++) //for loop for taking the array elements 
        {
            //arr[i]=sc.nextInt();
            int count=1;
            for(int j=i+1;j<arr.length;j++) // comparing the one element to anoother element
            {
               if(arr[i]==arr[j]) //if first array elements is equal to second array element
               {
                   count++; //then count++
                   freq[j]=-1; //frequency value =-1
               }
               
            }
            if(freq[i]!=-1) //visted value -1
            {
                freq[i]=count; // count value is stored in freq[i]
            }
        }
            for(int i=0;i<freq.length;i++) // print the array elements and freq elements
            {
               if(freq[i]!=-1) 
               {
                   System.out.println(arr[i]+"-"+freq[i]);
               }
            }
           // sc.close(); // scanner close
        }
    }

