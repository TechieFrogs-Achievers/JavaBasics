package Arrays;

import java.util.Scanner;

public class ArrayExcersice17 {
    public static void main(String[] p){
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter the "+n+" th biggest element");
        int n=2;
       
        char[] k={'a','c','b','h','r'};
        int length=k.length;
      for(int i=0; i<=length-1; i++){
         for(int j=0; j<=length-1; j++){
             if(k[i]>k[j]){
             char temp=k[i];
             k[i]=k[j];
             k[j]=temp;
         }
        }
    }
     System.out.println(n+" th largest element is "+k[n-1]);

    sc.close();
}
    
}
