public class PascalTriangleWithNumbers 
{
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<= n; i++)
        {
            fact =fact * i;
        }

        return fact;

    }
    static int nCr(int n,int r)
    {
        return factorial(n)/(factorial(r) * factorial(n-r));
    }
    public static void pascalWithNumbers(int rows)
    {
        for(int i=0;i <=rows; i++)
        {
            for(int spaces=0; spaces <= (rows-i); spaces++)
            {
                System.out.print(" ");
            }
            for(int spaces=0; spaces <= i; spaces++)
            {
                System.out.print( +nCr(i,spaces) +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //PascalTriangleWithNumbers p= new PascalTriangleWithNumbers();
        pascalWithNumbers(6);
    }
    
}
