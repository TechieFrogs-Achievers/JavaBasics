package Arrays;
//program to check identity matrix 
import java.util.Scanner;
public class ArrayExcersice27 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in) ; 
    //declaring an array
    int [][] g = new int [3][3];
    //initializing array
    System.out.println(" Enter Number 3 rows and 3 columns ") ; 
    for (int i=0 ; i < g.length ; i++){   
    for (int j=0 ; j <g[i].length ; j++){
    g[i][j]=sc.nextInt();
    }
    }
    sc.close();
    boolean e=true;
    //traversing through elements of array
    for (int i=0 ; i < g.length ; i++){   
    for (int j=0 ; j < g[i].length ; j++){
    //condition to check identity or not
       if((i==j && g[i][j]==1) || (i!=j && g[i][j]==0)){
          e=true;
       }
    }
}
    if(e)
            System.out.println(" it's a Identity  matrix ") ; 
       
        else{
             System.out.println(" it's not  a Identity  matrix ") ; }
       
    }
}