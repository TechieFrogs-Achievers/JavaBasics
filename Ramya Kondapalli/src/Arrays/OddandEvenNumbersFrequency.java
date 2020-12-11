package Arrays;

import java.util.Scanner;

public class OddandEvenNumbersFrequency {
    public static void main(String[] args) {
        
        int row=3,column = 3,evenCount= 0,oddCount = 0;
        int[][] arr = new int[row][column];  //declaring new array

        Scanner s = new Scanner(System.in);

        //taking user inputs 
        for(int i=0;i<row;i++){

            for (int j=0;j<column;j++){

                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        
        //displaying the entered matrix
        System.out.println("The given matrix is : ");

        for(int i=0;i<row;i++){

            for (int j=0;j<column;j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //code for calculating frquency of even and odd numbers
        for(int i=0;i<row;i++){

            for (int j=0;j<column;j++){

                if(arr[i][j] %2 ==0)
                    evenCount++;
                else
                    oddCount++;
            }
        }

        System.out.println("Frequency of even numbers in given matrix are : " + evenCount);
        System.out.println("Frequency of odd numbers in given matrix are : " + oddCount);
    }
}
