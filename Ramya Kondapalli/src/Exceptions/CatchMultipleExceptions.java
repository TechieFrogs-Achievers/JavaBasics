package Exceptions;

import java.util.Scanner;

public class CatchMultipleExceptions {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //try block for exception
        try{
            int[] arr = new int[5];
            System.out.println("Enter the value : ");
            arr[3] = s.nextInt();
            int res = arr[3] / 0;
            System.out.println(res);
        }

        //multiple catch blocks for handling different types of exceptions

        //Array index out of boundary exception handled by catch block
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array index is out of boundary ");
        }

        //Arithmetic exception handled by catch block
        catch(ArithmeticException i){
            System.out.println("Arithmetic Exception");
        }

        //unknown exception hndled by catch block
        catch(Exception e){
            System.out.println("Invalid input");
        }

        s.close();
    }
}
