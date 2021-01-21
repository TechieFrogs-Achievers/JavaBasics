package Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        int[][] transpose = new int[3][3];

        //code for matrix transpose
        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length;j++){

                transpose[i][j] = arr[j][i];
            }
        }
        //matrix before transpose
        System.out.println("Before Transpose : ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //matrix after transpose
        System.out.println("After Transpose : ");
        for (int i=0;i<transpose.length;i++){
            for (int j=0;j<transpose.length;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
