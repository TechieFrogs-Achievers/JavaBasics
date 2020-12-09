public class ArrayExample46 
{
    public static void main(String[] args) 
    {
      int []a = {11,22,3,41};
      int []b = {4,16,1,23};
      int l = a.length+b.length;//adding two arrays length
      int c[] = new int[l];//array with fixed length
      int value = 0;
      
      for(int i = 0; i < a.length; i++) 
      { 
         c[i] = a[i];//copying the array elements into c array
         value++;
      } 
      for(int j = 0; j < b.length;j++) 
      { 
         c[value++] = b[j];//copying the array elements into c array
      } 
      System.out.println("the concatenate of two arrays is");
      for(int i = 0;i < c.length;i++) 
      {
      System.out.print(c[i]+" ");// printing the merged array 
      }
    }
}
