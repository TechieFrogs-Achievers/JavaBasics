package Arrays;

public class RightRotation {
    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,4,5};

        int n = 3; //variable for defining rotations 

        System.out.println("Before rotation");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        for (int i=0;i<n;i++){
            int j,last;
            ////stores the last element of the array
            last = arr[arr.length-1];

            for(j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];  //right rotation by one 
            }
            arr[j] = last;  //storing last elemnt at first position
        }

        System.out.println();

        System.out.println("After rotation");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
