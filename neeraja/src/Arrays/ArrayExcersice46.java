package Arrays;

//program to concatenate two arrays
public class ArrayExcersice46 {
    public static void main(String[] y){


//USING ONE DIMENSIONAL
        //declaring arrays
    int a[]={4,5,2};
    int a1[]={8,9,4};

    int a2[]=new int[a.length+a1.length];
    int k=0;

    //appending first array elements 
    for(int i=0; i<a.length;i++){
      a2[k++]=a[i];
    }
    //appending second array elements
    for(int i=0; i<a1.length;i++){
        a2[k++]=a1[i];
      }

    //resultant array
      for(int i=0; i<a2.length;i++){
        System.out.print(a2[i]+" ");
      }




//USING TWO DIMENSIONAL ARRAYS
     /*  int[][] b={{1,2,},{6,5}};
       int[][] b1={{3,9,},{5,7}};
       int l1=b.length;
       int l2=b1.length;

       int[] b2[]=new int[l1+l2][b.length+b1.length];
       //int k1=0;

       for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            b2[i][j]=b1[i][j];
       }}
       for(int i=0;i<b1.length;i++){
        for(int j=0;j<b1.length;j++){
            b2[i][j]=b1[i][j];
       }}]} */


       

    
    
}
}