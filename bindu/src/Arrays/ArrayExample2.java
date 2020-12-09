package Arrays;

import java.util.Scanner;

public class ArrayExample2 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        int length= sc.nextInt();   //integer creation
        int array[]=new int[length];    //initializing the array to store the elements
        int freqarray[]= new int[length];   //frequency array
        int visited =-1;     
        int count;  //to count the number of times the element is there
        for (int i=0;i<array.length;i++)   //to read the elements of array
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            count =1;
        for(int j=i+1;j<array.length;j++)  //compare the elements
        {
            if(array[i]==array[j])   //array1 equals to array2 then it goes too count++
            {
                count++;
                freqarray[j]=visited;
            }

        }
        if(freqarray[i]!=visited)   //checks the frequency elements that are not equal
        {
            freqarray[i]=count;
        }
    }
    for(int i=0;i<array.length;i++)    //for printing the elements
    {
        if(freqarray[i]!=visited)
        {
            System.out.println(array[i]+" "+freqarray[i]);  
        }
    }
    sc.close();  //scanner close
    
 }
}
