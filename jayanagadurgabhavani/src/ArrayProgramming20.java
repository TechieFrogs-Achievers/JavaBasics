public class ArrayProgramming20 
{
    public static void main(String args[])
    {
        int temp, size;
        int a[] = {11,22,33,44,55,66};
        size = a.length;
        
        for(int i = 0; i<size; i++ )
        {
           for(int j = i+1; j<size; j++)//third largest number of array
           {
              if(a[i]>a[j])
              {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
              }
            }
        }
        System.out.println("Third largest number is: "+(size-3));
    }
}
