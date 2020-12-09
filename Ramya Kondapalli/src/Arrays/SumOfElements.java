package Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4,5,6};
        int sum =0; //variable for sum of elements

        //loop for sum 
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements : " + sum);  
    }
}
