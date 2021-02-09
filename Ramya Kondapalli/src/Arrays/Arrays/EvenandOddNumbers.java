package Arrays;

public class EvenandOddNumbers {
    public static void main(String[] args) {

        //declaring array
        int[] arr = new int[] {2,42,5,1,56,43,77,32,17,85};

        System.out.println("Even numbers in array : ");
        //printing even numbers in array
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 ==0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Odd numbers in an array : ");
        //printing odd numbers in array
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 !=0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
