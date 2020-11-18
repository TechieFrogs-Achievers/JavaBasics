public class FloydTrianglePattern 
{
    public void floydTriangle(int rows)
    {
        int k=1;
       for(int i=1;i <= rows; i++)
       {
           for(int j=1; j <= i; j++,k++)
           {
               System.out.print(k +" ");
           }
           System.out.println();
       } 
    }
    public static void main(String[] args) {
        FloydTrianglePattern f= new FloydTrianglePattern();
        f.floydTriangle(5);
    }
    
}
