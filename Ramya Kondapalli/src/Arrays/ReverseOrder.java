package Arrays;

public class ReverseOrder {
    public static void main(String[] args) {

        char[] arr = new char[] {'r','a','m','y','a'}; //declaring array

        System.out.print("Original array : ");
        for (int i=0;i<arr.length;i++ ){
            //printing original array
            System.out.print(String.valueOf(arr[i]));;
        }

        System.out.println();

        System.out.print("Reverse array : ");
        for (int i = arr.length-1; i>=0; i--){
            //printing reverse array
            System.out.print(String.valueOf(arr[i]));
        }

    }
}
