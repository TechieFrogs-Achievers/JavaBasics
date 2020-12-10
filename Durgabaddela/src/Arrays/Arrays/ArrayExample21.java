package Arrays;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayExample21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();// taking length from keyboard
        System.out.println("enter the array elements");
        int arr[] = new int[n];// creating an array with n size
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the array elements are =" + Arrays.toString(arr));// to print the array elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    //arr = ArrayUtil.remove(arr, j);
                }
            }
        }
        sc.close();
    }
}
