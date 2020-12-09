package Arrays;

public class evenIndexArray 
{
    public static void main(String[] args) 
    {

        int[] val = new int[]{12,23,25,45,63,25}; //array data
        for(int i=1;i<val.length;i=i+2)  //points the even index
        {
            System.out.println(val[i]); //prints the elements in even index place
        }
        
    }
    
}
