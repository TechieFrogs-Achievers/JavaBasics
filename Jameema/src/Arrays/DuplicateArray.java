package Arrays;

public class DuplicateArray 
{
    public static void main(String[] args) 
    {
        int[] val = new int[]{1,2,5,1,6,8,5,4};   //array values
        for(int i=0;i<val.length;i++) //check the condition
        {
            for(int j=i+1;j<val.length;j++)
            {
                if(val[i]==val[j]) //true
                {
                    System.out.println("the duplicate values are:" +val[j]); //print the result
                }
            }

        }
        
    }
    
}
