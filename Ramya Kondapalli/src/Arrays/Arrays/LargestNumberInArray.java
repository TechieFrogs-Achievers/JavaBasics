package Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {

        //array Declaration
        int[] arr = new int[] {11,44,83,24,9,34,85};

        //stores the first element of the array
        int max = arr[0];

        //loop for finding the largest num in array
        for (int i=1;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        //printing the max number in array
        System.out.println(max);
    }
}
