package Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] arr = new int[]{2,65,94,23,75,56,11,11,44};
        
        int temp; //temporary variable

        for (int i=0;i<arr.length-1;i++){

            for (int j=i+1;j<arr.length;j++){

                //sorting array in descending order
                if (arr[i] < arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                } 
            }
        }

        //displaying array after sorting
        for (int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }
}
