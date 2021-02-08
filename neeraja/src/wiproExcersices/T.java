package wiproExcersices;

import java.util.Scanner;

public class T {

    public static void cube(int sum) {
       int cube;
       
       for(int i=1;i<=sum;i++){
           cube=i*i*i;

           if(cube==sum){
             System.out.println("yes");
           }
           else if(cube>sum){
               System.out.println(cube-sum);
           }
       }
 }
   public static void main(String[] k){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n] ,sum=0;
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
           sum=sum+a[i];
       }
       cube(sum);
    }
    
}


