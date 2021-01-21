package Arrays;

import java.util.Scanner;

public class CheckingTheElement {
    public static void main(String[] args) {
        
        int[] arr = new int[]{31,5,8,29,211,8,9,72};
        boolean result = false;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = s.nextInt();

        //checking the given umber in array
        for (int i=0;i<arr.length;i++){
            if (arr[i] == number){

                result = true;
                break;
            }   
        }
        s.close();

        //printing the status of given number
         if(result){
            System.out.println("Yeah! The Array contains the given number ");
        }
        else 
            System.out.println("No! The Array doesn't contains the given number ");
    }
}
