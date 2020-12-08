package Arrays;

public class SampleArray 
{
     static void disply(int[] input)//method for display elements
    {
     for(int counter=0;counter<input.length;counter++)
     {
         System.out.println(input[counter]);
     }
    }
    public static int[] reverseArray(int[] input)//parameterized method for reverse elements
    {
        int[] reverse=new int[input.length];
        for(int i=0,j=reverse.length-1;i<input.length;i++,j--)
        {
          reverse[j]=input[i];
        }
        return reverse;
    }
   public static void main(String[] args) 
   {
       int[] marks={11,22,33,44,55,66};
       disply(marks);//method calling
       int[] revmarks;//array 
       revmarks=reverseArray(marks);
       System.out.println("reverse array elements");
       disply(revmarks);//calling method
   } 
}
