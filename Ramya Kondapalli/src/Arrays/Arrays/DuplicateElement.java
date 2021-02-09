package Arrays;

public class DuplicateElement {
    public static void main(String[] args) {

        //declaring character array
        char[] arr = new char[] {'q','d','a','q','a','s','u','b','r','r'};

        for (int i=0;i<arr.length;i++){
            
            for (int j= i+1;j<arr.length;j++){
            
                if(arr[i] == arr[j]) //if two elements are equal then it will print 

                System.out.print(arr[j] + " "); //q a r
            }
        }

        System.out.println();

        //Declaring integer array
        int[] arr1 = new int[]{1,3,1,4,6,3,1,7,8,4};

        for (int i=0;i<arr1.length;i++){
            
            for (int j= i+1;j<arr1.length;j++){
            
                if(arr1[i] == arr1[j]) //if two elements are equal then it will print 

                System.out.print(arr1[j] + " "); //1 1 3 1 4
            }
        }
    }
}
