package Arrays;

import java.util.Scanner;

public class RemoveDuplicate 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        for(int i=0;i<val.length;i++) //read the input
        {
            val[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++) //check the condition
        {
            for(int j=i+1;j<length;j++)
            {
                if(val[i]==val[j]) //index of i isequal to indexof j
                {
                    for(int k=j;k<length-1;k++)
                    {
                        val[k]=val[k+1]; //replace the value
                       
                    }
                    length=length-1;      //remove tle length
                }
            }

        }
        System.out.println("after removing the duplicate values are:" ); 
        for(int i=0;i<length;i++)
        {
            System.out.println(val[i]); //prints the result
        }
        sc.close();

        
    }
    
}
