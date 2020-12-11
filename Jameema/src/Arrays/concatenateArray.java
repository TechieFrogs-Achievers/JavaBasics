package Arrays;

import java.util.Arrays;

public class concatenateArray 
{
    public static void main(String[] args) 
    {
        int[] a={11,25,45,96}; //first array
        int[] b={32,25,4,57}; //second array
        int[] result=new int[a.length+b.length];
        System.arraycopy(a, 0, result, 0, a.length); //copying the firstb array elements
        System.arraycopy(b, 0, result, a.length, b.length); //copring the second array elements
        System.out.println(Arrays.toString(result)); //combing the array elements
        
    }
    
}
