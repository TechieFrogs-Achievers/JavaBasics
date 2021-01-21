package Arrays;

public class EqualMatrix {
    public static void main(String[] args) {
        
        //declaring two arrays
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        boolean result = true;

        //code for finding equal matrix
        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){

                if(arr1[i][j] != arr2[i][j]){

                    result = false ;
                    break;
                }
            }
        }
        
        if(result)
            System.out.println("Matrices are equal");
        else 
            System.out.println("Matrices are not equal");
    }
}
