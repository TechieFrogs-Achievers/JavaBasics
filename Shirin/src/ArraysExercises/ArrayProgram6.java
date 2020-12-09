package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram6 
{
  public static void main(String[] args)
  {
    System.out.println(" Enter the length :");
    Scanner sc = new Scanner(System.in);//scanner class
    int length = sc.nextInt();// array length
    System.out.println(" Enter the elements");
    int array[] = new int[length];// array for storing the elements
    for( int i =0; i < array.length; i++)
    {
        array[i] = sc.nextInt();// elements read
    }
    for(int  i = array.length-1; i >= 0 ; i-- )// loop for reverse the every element
    {
        System.out.println(" The reverse order :" +array[i]);// printing  the elements reverse
    }

    sc.close();// closing scanner class
      
  }  
}
