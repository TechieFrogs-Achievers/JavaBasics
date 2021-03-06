package Arrays;

public class AddingTwoMatrices {
    public static void main(String[] args){

        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = new int[][]{{9,8,7},{6,5,4},{3,2,1}};

        int[][] sum = new int[3][3]; //new array 

        //code for adding two matrices
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The resultant matrix : ");
        for (int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
