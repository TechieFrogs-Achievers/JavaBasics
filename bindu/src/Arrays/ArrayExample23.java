package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample23 {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int k = sc.nextInt();  //integer creation
        int arr[] = new int[k];  //initializing the array to store the elements
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();   //reads the elements
        }
        Arrays.sort(arr);  //sorts the elements
        for(int i=0;i<arr.length;i++)   
        {
            System.out.println(arr[i]);   //prints the elements of array
        }
        sc.close();   //scanner close

        
    }
    
}
