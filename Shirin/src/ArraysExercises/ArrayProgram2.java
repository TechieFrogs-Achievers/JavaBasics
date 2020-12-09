package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram2 
{
    public static void main(String[] args) 
    {
         System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);  //scanner class 
        int length= sc.nextInt();   //integer  for array length
        int array[]=new int[length];    //initializing  array to store the elements
        int freqarray[]= new int[length];   //frequency array
        int visited =-1;     
        int count;  //integer for count the number of elements are there
        for (int i=0;i<array.length;i++) 
        {
            array[i]=sc.nextInt();//reading elements
        }
        for(int i=0;i<array.length;i++)// loop for checking first element in array
        {
            count =1;
        for(int j=i+1;j<array.length;j++)  //compare the elements
        {
            if(array[i]==array[j])   //array1 equals to array2
            {
                count++;// count increase
                freqarray[j]=visited;
            }

        }
        if(freqarray[i]!=visited)   //checks the frequency elements that are not equal
        {
            freqarray[i]=count;// count start from 1
        }
    }
        for(int i=0;i<array.length;i++)    //for printing the elements
        {
            if(freqarray[i]!=visited)
            {
                System.out.println(array[i]+" "+freqarray[i]);  
            }
        }
        sc.close(); // closing scanner class
    
 }
        
        
        
    
    
}
