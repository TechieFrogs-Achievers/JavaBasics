public class Array21 
{  
    public static void main(String []args)
    {
        String arr[] = { "u" , "v", "h" , "p", "i", "u", "p" };
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if( arr[i].equals((arr[j])))
                {
                    arr[j] = "" ;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
