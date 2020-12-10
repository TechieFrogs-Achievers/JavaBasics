package Arrays;

import java.util.Arrays;
//import java.util.*;
public class ArrayExample47 
{
    public static void main(String[] args) 
    {
        
        char ch[] = {'a', 'n' , 'u' ,'s','h','a'};
        String str = new String(ch);    // converting char array to string
        System.out.println(str);
        String string = "java programming";
        char ch1[] = string.toCharArray();   // converting string to char array
        System.out.println(Arrays.toString(ch1));
    }
}
