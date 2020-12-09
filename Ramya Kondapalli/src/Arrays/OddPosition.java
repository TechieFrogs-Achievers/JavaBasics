package Arrays;

import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter array size : ");
        int n = s.nextInt();   //array size 

        System.out.println("Enter " + n + " elements in an array one by one");
        int[] arr = new int[n];     //declaring new array 

        //loop for dynamic input
        for (int i =0;i<=n;i++){
                arr[i] = s.nextInt();
        }

        for (int i=0;i<n;i++){
            if (i%2 ==0){  //checking the position of element 
                System.out.println(String.valueOf(arr[i]));
            }
        }
        s.close();
    }
}
