package Arrays;

import java.util.Arrays;

//concatenate two arrays using its length
public class ConcatinateArrays {
    public static void main(String[] args) {


        
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {6,7,8,9,0};

        int len = arr1.length + arr2.length; //finding total length

         //declaring new array with total length of two arrays
        int[] newArr = new int[len];

        //copying arr1 into new array
        System.arraycopy(arr1, 0, newArr, 0, arr1.length); 

        //copying arr2 into new array
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);

        //printing new array in string form
        System.out.println(Arrays.toString(newArr) ); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

        System.out.println();

        //displaying array
        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " "); //1 2 3 4 5 6 7 8 9 0 
        } 
    }
}
