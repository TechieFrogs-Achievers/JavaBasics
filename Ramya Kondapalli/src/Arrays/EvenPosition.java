package Arrays;

import java.util.Scanner;

public class EvenPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt(); //array size

        int[] arr = new int[n];   //decalring array size

        System.out.println("Enter 4 elements in an array one by one :");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elemnts in even position : ");
        for (int i=0;i<arr.length;i++){
            //printing even position elements
            if(!(i%2==0)){
                System.out.print(String.valueOf(arr[i]) + " ");
            }
        }

        System.out.println();

        //printing elements in character array
        char[] arr1 = new char[] {'r','a','m','y','a'};

        for (int i=0;i<arr1.length;i++){
            if(!(i%2 == 0)){  //checking the position of element
                System.out.println(String.valueOf(arr1[i]));
            }
        }
        sc.close();
    }
}
