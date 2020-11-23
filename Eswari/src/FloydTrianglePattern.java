//example for floyd triangle
public class FloydTrianglePattern 
{
    //method for printing floyd triangle
    public void floydTriangle(int rows)
    {
        int k=1;
       for(int i=1;i <= rows; i++)      //loop for printing how many rows needed
       {
           for(int j=1; j <= i; j++,k++)    //loop for printing values
           {
               System.out.print(k +" ");
           }
           System.out.println();
       } 
    }
    public static void main(String[] args) {
        FloydTrianglePattern f= new FloydTrianglePattern(); //object creation
        f.floydTriangle(5); //method calling
    }
    
}
