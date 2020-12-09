public class Array10 
{
    public static void main(String args[])
    {
        int array[] = {3,6,8,1,0} ;
        for(int i = 0 ; i < array.length ; i++)
        {
            for(int j = i+1 ; j < array.length ; j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i] ; 
                    array[i] = array [j] ;
                    array[j] = temp ;
                }
            }
        }
        System.out.println("The smallest element in the array is : " + array[0]);
    }      
}
