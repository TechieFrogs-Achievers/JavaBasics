package ArrayPrograms;

import java.util.Scanner;

public class Program34 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//scanner obj creation

        int rows = sc.nextInt(); //taking no of rows from keyboard
        int coloumns = sc.nextInt(); //taking no of rows from keyboard

        int array[][] = new int[rows][coloumns]; //initializing an array

        System.out.println("enter array elements");

        for(int i =0; i<rows; i++)
        {
            for(int j =0 ; j<coloumns;j++)
            {
                array[i][j] = sc.nextInt(); //taking array elements 
            }
        }  

        int rowsSum ,columnsSum;

        int coloum = array[0].length; //column length always first row value


        System.out.println("array elements"); 
        for(int i =0 ; i < rows;i++)//loops for printing an array
        {
          for(int j =0; j<coloumns; j++)
          {
              System.out.print(array[i][j] + " ");
          } 
          System.out.println();
        }    
        System.out.println("sum of each rows and columns : ");

        for(int i = 0; i< rows; i++)
        {  
            rowsSum=0; //after every iteration the value wiil be starts from zero

            for(int j =0 ; j<coloum; j++)
            {
               rowsSum = rowsSum + array[i][j]; //adding of each row values into rowssum
            } 
            System.out.println( i+1 +" row sum "+ rowsSum + " ");
          
        }  

        System.out.println();
     

       for(int i =0;i <rows ; i++)
       {  
           columnsSum =0;//after every iteration the value wiil be starts from zero

           for(int j=0; j<coloum; j++)
           {
            columnsSum += array[j][i];//adding of each column values into columnssum
           } 
           System.out.println( i+1 + "   column sum   " +columnsSum + " ");

       }
        sc.close();
        
    }
    
}
