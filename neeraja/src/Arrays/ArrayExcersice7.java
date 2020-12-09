package Arrays;

import java.util.Scanner;
//program to print elements in even and odd positions
public class ArrayExcersice7 {
    public static void main(String[] m){
        //taking input from stdin
        Scanner s=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
        }
        //for(int j:arr){
        //    System.out.println(j);
        //}

        //elements at even positins
        System.out.println("elements at even positions");
        for(int i=0; i<arr.length; i++){
            if((i%2)==0){
                System.out.println(arr[i]);
            }
        }
     s.close();
        //elements at odd positions
        System.out.println("elements at even positions");
        for(int i=0; i<arr.length; i++){
            if((i%2)!=0){
                System.out.println(arr[i]);
            }
        }

       
    }
    
}
