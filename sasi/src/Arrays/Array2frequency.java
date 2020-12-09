package Arrays;

import java.util.Scanner;

//import org.w3c.dom.css.Counter;

public class Array2frequency 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int  len=sc.nextInt(); //giving len of an array
        int arr[]=new int[len]; //initilize an array
        int counts[]=new int[len]; 
        int visited=-1;
        int count; //for how many times it counts
        for(int i=0;i<arr.length;i++) //loop for reading array elemts
        {
            arr[i]=sc.nextInt();//reading elemts
        }
        for(int i=0;i<arr.length;i++) //for loop for first elemt
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
            if (arr[i] == arr[j]) //checks first elemt to another
            {
                count++;
                counts[j]=visited;
            }
        }
        if(counts[i]!=visited) //if frequency of elemts is not equal to-1 than the frequency of that is count
        {
            counts[i]=count;
        }
    }
        for(int i=0;i<counts.length;i++)
        {
            if(counts[i]!=visited) // checks the cond equal or not
            {
                System.out.println(arr[i] +  " "+counts[i]);
            }
            sc.close();
        }
    }
}



