package Exceptions;

public class IndexOutofBoundaryException {
    public static void main(String[] args) {
        
        //try block
        try{
            int[] arr = new int[6];  //declarng array with size
            arr[8] = 33;   //giving value to array
            System.out.println(arr[8]);
        }

        //catch block for handling exception
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("Array index out of boundary exception ");
        }
    }
}
