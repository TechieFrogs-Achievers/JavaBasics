package Arrays;

public class SmallestNumber {
    public static int getSmallestNumber(int[] arr,int pos){
        int temp;   //temporaray variable

        // int thirdlargestNumber = 3,secondLargestNumber = 2;


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

        return (arr[pos]);
    } 
    public static void main(String[] args) {

        int[] arr = new int[] {12,35,84,62,28,93,15};
        System.out.println("2nd smallest number : " + getSmallestNumber(arr,1));
        System.out.println("Smallest number : " + getSmallestNumber(arr,0));
        
    }
}
