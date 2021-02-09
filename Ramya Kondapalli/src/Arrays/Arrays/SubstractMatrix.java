package Arrays;

public class SubstractMatrix {
    public static void main(String[] args) {
        
        int[][] arr1 = new int[][]{{45,34,60},{87,64,32}};
        int[][] arr2 = new int[][]{{24,12,44},{54,33,16}};

        int[][] result = new int[2][3];

        //code for substraction matrix
        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){

                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        //printing first matrix
        System.out.println("First matrix : ");
        for (int i=0;i<arr1.length;i++){

            for(int j=0;j<arr1.length;j++){

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //printing second matrix
        System.out.println("First matrix : ");

        for (int i=0;i<arr2.length;i++){

            for(int j=0;j<arr2.length;j++){

                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        //printing substraction matrix
        System.out.println("Substraction matrix : ");
        
        for (int i=0;i<result.length;i++){

            for(int j=0;j<result.length;j++){

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
