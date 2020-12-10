package Arrays;
//program to copy elements from one to another array
public class ArrayCopy {
    public static void main(String[] args) {  
        //declaring a source array  
        char[] copy = { 'n', 'e', 'e', 'r', 'a', 'j', 'a' };  
        //declaring a destination array  
        char[] T = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copy, 2, T, 0, 4);  
        //printing the destination array  
        System.out.println(String.valueOf(T));  
    }  
    
}
