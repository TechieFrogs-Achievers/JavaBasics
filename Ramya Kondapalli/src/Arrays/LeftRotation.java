package Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5}; 
        //variable for rotations 
        int n =1;

        System.out.println("Original array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        for (int i =0;i<n;i++){

            int j;

            //stores the first element of the array
            int first = arr[0];

            //rotating array to left 
            for ( j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            //adding first element at last
            arr[j] = first;
        }
        System.out.println();

        System.out.println("After rotation ");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
