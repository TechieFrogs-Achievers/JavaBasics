package Arrays;

public class MatrixMultiplicationByFunction {

    public static void display(int[][] arr1, int[][] arr2, int[][] result){
        
        //code for matrix multiplication
        for (int i=0;i<3;i++){

            for(int j=0;j<3;j++){

                for (int k=0;k<3;k++){

                    result[i][j] += arr1[i][k] *  arr2[k][i];
                }
            }
        }
    }
    public static void main(String[] args) {

        int[][] arr1 = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
        int[][] arr2 = new int[][]{{1,1,1},{2,2,2},{3,3,3}};

        int[][] result = new int[3][3]; //new array for storing result


        //method calling by passing paramaeters to function
        display(arr1,arr2,result); 

        //displaying result after multiplication
        System.out.println("The resultant matrix : ");
        
        for(int i=0;i<3;i++){

            for (int j=0;j<3;j++){

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
