package Arrays;

public class ArrayExcersice36 {

    public static void main(String []k){

        float[] []a={{3.2f,1.2f,4.3f},{3.2f,1.2f,4.3f},{3.2f,1.2f,4.3f}};
        float[] []b={{7.2f,6.2f,2.3f},{4.2f,1.6f,4.3f},{9.2f,2.2f,8.3f}};

    //logic to perform addition operation
       //declaring another matrix to strore resultant matrix
       float[][] result=new float[3][3];

       for(int i=0; i<b.length; i++){
        for(int h=0; h<b.length; h++){
            result[i][h]=a[i][h]+b[i][h];//logic to perform addition of two matrices
        }
        System.out.println();
    }

    //displays resultant matrixxx
    System.out.println("RESULTANT ADDITION MATRIX:");
    for(int i=0; i<b.length; i++){
        for(int h=0; h<b.length; h++){
        System.out.print(result[i][h]+"  ");
        }
        System.out.println();
    }


}
}
