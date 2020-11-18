public class RightPascalTriangle 
{

    public void rightPascal(int rows)
    {
        for(int i=1; i <= rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

        for(int i=rows; i >=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightPascalTriangle r= new RightPascalTriangle();
        r.rightPascal(8);
    }
}
    

