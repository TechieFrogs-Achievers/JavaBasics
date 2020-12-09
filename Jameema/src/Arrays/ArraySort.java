package Arrays;

import java.util.Arrays;

public class ArraySort 
{
    public static void main(String[] args)
    {
        String[] val = {"jemi","bindu","shiri","rama"}; //array elements
        int [] val1 ={12,2,23,52,3,15,51,56,21,24};
        Arrays.sort(val);  //sorting all the elements
        Arrays.sort(val1,2,6); //sorting within the index elements
        System.out.println(Arrays.toString(val));
        System.out.println(Arrays.toString(val1)); //printing the  result
        
        
    }
    
}
