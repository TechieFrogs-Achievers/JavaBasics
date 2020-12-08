package Arrays;

import java.util.Scanner;
//program to find duplicates in array
public class ArrayExcersice4 {
    public static void main(String[] m){
        //by taking input through stdin
        Scanner s=new Scanner(System.in);
       // int count=0;
        int[] arr=new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
        }
        //traversing to search duplicates in array
        System.out.println("Duplicate elements in given array: "); 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
            System.out.println(arr[j]);
            count++;
            break;
            }
          }
         }
         s.close();
//by directly Initialize array   
        /*int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  */
    
}
}