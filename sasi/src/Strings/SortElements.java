package Strings;

import java.util.Scanner;

//import org.graalvm.compiler.lir.LIRInstruction.Temp;

public class SortElements 
{
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in); //input class 
         String[] s={"sasi","bhanu"}; 
         for (int i=0;i<=2;i++)
         {
             for(int j=i+1;j<2;j++)
             {
                 if(s[i].compareTo(s[j])>0) //compare two string
                 {
                    String temp=s[i]; //swapping 
                     s[i]=s[j];
                     s[j]=temp;
                 }
                //System.out.print("lexography order:"+s[j]);
            }
        }
        for(int i=0;i<2;i++)
        {
        System.out.println("string is :"+s[i]);
        sc.close();
    }
}
    
}
