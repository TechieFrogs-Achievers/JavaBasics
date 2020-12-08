public class ArrayExample11 
{
    public static void main(String[] args)
    {
        int count = 0;
       int array[] = {2,5,12,34,22,45} ;
       for(int i=0; i<array.length; i++)
       {
          array[i] = count++;//count increases when loop reaches every element
       }
       System.out.println("the total number of elements of an array ="+count);

    }

}
