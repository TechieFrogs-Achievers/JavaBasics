package Arrays;

import java.util.Scanner;

public class OddIndexArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //scanner class
        int length  = sc.nextInt(); //length of array
        int[] val=new int[length];
        for(int i=0;i<val.length;i++) //reading array values
        {
            val[i]=sc.nextInt();
        }
        for(int j=0;j<val.length;j=j+2)
        {
            System.out.println("the odd position value:"+val[j]); //print the odd position element
        }

        sc.close();
        
    }
    
}
