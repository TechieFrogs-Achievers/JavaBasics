package Arrays;

public class SmallestNumberInArray {
    public static void main(String[] args) {

        //array declaration
        int[] arr = new int[]{22,43,6,24,33,90,1};

        //stores the first element of the array
        int min = arr[0];

        //loop for finding smallest number in array
        for (int i=1;i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        //printing smallest number in array
        System.out.println(min); 
    }
}
