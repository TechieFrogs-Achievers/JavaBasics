package Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int arr[][] =  {{1,2},{3,4}}; //2D array

        for (int i= 0;i<2;i++){

            for (int j=0;j<2;j++){

                System.out.println(arr[i][j]);  //printing 2D array
            }
        }
    }
}
