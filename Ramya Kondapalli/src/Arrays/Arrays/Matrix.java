package Arrays;

//printing in matrix form
public class Matrix {
    public static void main(String[] args) {
        
        //declaring array
        int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        //loop for printing arrays in matrix form 
        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length;j++){

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
