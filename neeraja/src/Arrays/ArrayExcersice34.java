package Arrays;
import java.util.*;
//program to caculate sum of each row aand colomn

class ArrayExcersice3{
    public static void main(String[] e){

        //taking input from keyboard/user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
            int row=sc.nextInt();
            System.out.println("enter no of colams");
            int col=sc.nextInt();
            int sum1=0;
            int sum2=0;

            System.out.println("enter array elements");
       //declaring and initializing an array
       int[][] mat=new int[row][col];
       for(int i=0;i<row;i++) { 
        for(int j=0;j<col;j++) { 
            mat[i][j]=sc.nextInt();
           }
       }
   sc.close();
    int j=0 , i=0;

    //calculating sum of each row
    for( i=0;i<row; i++){
        sum1=0;
        for( j=0;j<col; j++){
           sum1=sum1 + mat[i][j];
     }
        //display sum of elements in array
        System.out.println("sum of elements of "+(i+1)+" row   :"+sum1);
    }

    //calculating sum of elements of column
    for( i=0;i<col; i++){
        sum2=0;
        for( j=0;j<row; j++){
           sum2=sum2 + mat[j][i];
     }
        //display sum of elements in array
        System.out.println("sum of elements of "+(i+1)+"th coloumn   :"+sum2);
    }



    }

}