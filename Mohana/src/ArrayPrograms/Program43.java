package ArrayPrograms;

public class Program43 
{
     void multiply(int arr1[][], int arr2[][])//creating a method with  two arrays as its parameters 
     {
        System.out.println("product of two matrices");

        int mul[][] = new int[3][3];//another array creation with length

        for (int i = 0; i < 3; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
                 mul[i][j] = 0;

                for (int k = 0; k < 3; k++) 
                {
                  mul[i][j] = arr1[i][k] * arr2[k][j];//multiplication of two matrices
                }

                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
     {
        int[][] a = { { 2, 3, 5 }, { 3, 4, 3 },{3,4,6}};//array1 initilazation 
        int[][] b = { { 4, 5, 2 }, { 4, 1, 9 },{3,6,2}};//array2 initilazation

        Program43 pr = new Program43();//creating an obj to class

        pr.multiply(a, b);//method call
       
        
    }
        
}
    

