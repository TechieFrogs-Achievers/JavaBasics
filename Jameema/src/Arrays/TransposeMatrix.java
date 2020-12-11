package Arrays;

import java.util.Scanner;

public class TransposeMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        int length = sc.nextInt(); //input length
        int [][] val = new int[length][length]; //normal matrix values
        int [][] trans=new int[length][length]; //transpose matrix values
        for(int i=0;i<val.length;i++) 
        {
            for(int j=0;j<val.length;j++) //for reading input values
            {
                val[i][j]=sc.nextInt();
            }
            
        }

        System.out.println("transpose matrix");
        for(int i=0;i<val.length;i++)
        {
            for(int j=0;j<val.length;j++)
            {
                trans[i][j]=val[j][i]; //condition for transpose matrax
               System.out.print( +trans[i][j] + " "); //printing the transpose matrix
            }
            System.out.println();
            
        }
        sc.close();
        
    }
    
}
