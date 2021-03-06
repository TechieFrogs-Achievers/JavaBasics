package Arrays;

public class SumofEachRowandColumn {
    public static void main(String[] args) {
        
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int sumRow =0,sumColumn =0;
        
        //code for calculating sum of rows
        for (int i =0;i<arr.length;i++){

            sumRow =0;

            for (int j=0;j<arr.length;j++){

                sumRow = sumRow+arr[i][j];
            }
            System.out.println("Sum of " + (i+1) + " row : " + sumRow);
        }

        System.out.println();

        //code for calculating sum of each column
        for (int i =0;i<arr.length;i++){

            sumColumn =0;

            for (int j=0;j<arr.length;j++){

                sumColumn = sumColumn+arr[j][i];
            }
            System.out.println("Sum of " + (i+1) + " column : " + sumColumn);
        }
    }
}
