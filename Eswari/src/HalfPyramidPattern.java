public class HalfPyramidPattern 
{
    //half pyramid pattern program1 using *
    public void halfPyramid(int rows)
    {
        for(int i=1; i <= rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*" );
            }
            System.out.println();
        }
    }

    //half pyramid pattern program using 1
    public void halfPyramid1(int rows)
    {
        for(int i=1; i <= rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j );
            }
            System.out.println();
        }
    }

    //half pyramid pattern program using alphabets
    public void halfPyramid2(int rows)
    {
        int alphabet=65;
        for(int i=1; i <= rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print((char)alphabet +" ");
            }
            alphabet++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HalfPyramidPattern hpp= new HalfPyramidPattern();
        hpp.halfPyramid(5);
        hpp.halfPyramid1(6);
        hpp.halfPyramid2(6);
    }
    
}
