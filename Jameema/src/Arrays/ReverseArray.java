package Arrays;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        int[] val = new int[]{12,14,52,36,12}; //array elements
        for(int i=val.length-1;i>=0;i--)
        {
            System.out.println(val[i]); //prints the array in reverse order
        }
        
    }
    
}
