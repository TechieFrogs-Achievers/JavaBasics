package Arrays;
//program to find smallest elementin in an array
import java.util.Scanner;

public class ArrayExcersice19 {
    public static void main(String[] p){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the required"+n+" th smallest element");
         n=sc.nextInt();
        //declaring and initializing an array
        char[] k={'a','c','b','h','r'};
        int length=k.length;

      for(int i=0; i<=length-1; i++){
         for(int j=0; j<=length-1; j++){
             //condition to check highest element
             if(k[i]<k[j]){
             char temp=k[i];
             k[i]=k[j];
             k[j]=temp;
         }
        }
    }
      //display the nth smallest element
     System.out.println(n+" th smallest element is "+k[n-1]);

    
}
}
