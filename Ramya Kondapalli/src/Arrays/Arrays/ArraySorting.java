package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[] arr = new int[5];  //declaring input array

        System.out.println("Enter the array elements : ");
        for(int i=0;i<5;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Array before sorting : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);   //array is sorting by using sort option
        System.out.println();

        System.out.println("Array after sorting : ");
        for (int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");

        s.close();

    }
}
