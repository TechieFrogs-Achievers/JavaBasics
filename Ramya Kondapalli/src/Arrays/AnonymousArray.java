package Arrays;

public class AnonymousArray {
    static void display(int[] arr){   //method to print array elements by passing array as parameter
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] get(){  //it returns array
        return new int[]{10,20,30,40};
    }
    public static void main(String[] args) {

        display(new int[] {11,22,33,44});//method calling by passing array as elemnt

        int arr1[] = get();  //method calling

        for(int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
