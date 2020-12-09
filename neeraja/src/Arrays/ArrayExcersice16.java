package Arrays;

import java.util.Scanner;
//program tofind nth largest element in array
public class ArrayExcersice16 {
    public static void main(String[] p){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the "+" th biggest element you want");
         n=sc.nextInt();
        
         //declaring and initializing an array
        char[] k={'a','c','b','h','r'};
        int length=k.length;
      for(int i=0; i<=length-1; i++){
         for(int j=0; j<=length-1; j++){
             //condition to check highest element
             if(k[i]>k[j]){
             char temp=k[i];
             k[i]=k[j];
             k[j]=temp;
         }
        }
    }
    sc.close();
    //display the nth hight element
     System.out.println(n+" th largest element is "+k[n-1]);

    
}
}