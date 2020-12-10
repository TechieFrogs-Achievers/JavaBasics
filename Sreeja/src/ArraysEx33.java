public class ArraysEx33
 {
     public static void main(String[] args) 
     {
        //initializing the matrices
       
        int arr[][]={{1,2,3},{4,5,6},{1,2,3}};
        int arr1[][]={{1,2,3},{4,5,6},{1,1,1}};

        int arr2[][]= new int[3][3];        //creating matrix to store the product of two matrices

        for(int i=0;i<3;i++)            //loop for rows
        {
            for(int j=0;j<3;j++)            //loop for coloumns
            {
                arr2[i][j]=0;
                
                for(int k=0;k<3;k++)
                {
                    arr2[i][j]+= arr[i][k] * arr1[k][j];    //product of two matrices
                }
                System.out.print(" "+arr2[i][j]);           //print the elements
            }
            System.out.println();
            
        }
    }
}
