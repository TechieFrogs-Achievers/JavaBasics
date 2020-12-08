package Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        
        int[] arr = new int[] {22,44,12,68,97,33,58,48,65};

        int temp;   //temporaray variable

        int thirdlargestNumber = 3,secondLargestNumber = 2;


        //loops for sorting array in ascending order
        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length;j++){

                if (arr[i] < arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //displaying array after sorting
        System.out.println("Sorted array : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        //printing 3rd largest number 
        System.out.println();
        System.out.print("3rd largest number : " + arr[thirdlargestNumber-1]);

        //printing 2nd largest number 
        System.out.println();
        System.out.print("2nd largest number : " + arr[secondLargestNumber-1]);

        System.out.println();
        System.out.print("Largest number : " + arr[arr.length-1]);
    }
}
