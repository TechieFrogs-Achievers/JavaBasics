package Arrays;

public class ArraysAverage {
    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,4,5,6};
        double sum=0;

        //sum all the elemnts in array
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        //calculating the average for sum
        double average = sum / arr.length;

        System.out.println("Average of array : " + average);
    }
}
