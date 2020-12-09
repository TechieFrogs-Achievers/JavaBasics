package Arrays;

public class SecondLargestElement 
{
    public static void main(String[] args) 
    {
        int[] val={12,45,8,98,65};
        int temp,size;  //temp variable for storing data
        size=val.length;
        for(int i=0;i<val.length;i++)
        {
            for(int j=i+1;j<val.length;j++)
            {
                if(val[i]>val[j]) //condition
                {
                    temp=val[i];
                    val[i]=val[j];
                    val[j]=temp;
                }

            }
        }
        System.out.println("the third largest element  :"+val[size-3]);  //prints the 2nd largest element
    }
    
}
