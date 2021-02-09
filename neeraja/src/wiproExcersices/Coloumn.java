package wiproExcersices;

import java.util.Scanner;

class Ricord{
      void temprature(int[][] mat,int r,int c){

        for(int i=0;i<r;i++){
            int small=mat[0][i];
            for(int j=1;j<c;j++){
              if(mat[j][i]<small){
                  small=mat[j][i];
              }
      }
      System.out.print(small+ " ");
}
      }
    }
//driver code
public class Coloumn {

    
    public static void main(String[] o){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of rows:");
        int rows=sc.nextInt();
        System.out.print("enter no of coloumss:");
        int colums=sc.nextInt();
        int[][] array=new int[rows][colums];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
               array[i][j]=sc.nextInt();
            }
        }
        sc.close();
        Ricord r=new Ricord();
        r.temprature(array,rows,colums);


    }
    
}
