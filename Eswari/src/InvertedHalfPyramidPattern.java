public class InvertedHalfPyramidPattern 
{
    //inverted half pyramid pattern program1 using *
    public void halfPyramid(int rows)
    {
        for(int i=1; i <= rows; i++)
        {
            for(int j=rows; j>=i; j--)
            {
                System.out.print("*" );
            }
            System.out.println();
        }

    }

    //inverted half pyramid pattern program1 using *
    public void halfPyramid1(int rows)
    {
        for(int i=rows; i >= 1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }

    //inverted half pyramid pattern program1 using *
    public void halfPyramid2(int rows)
    {
        int alphabet=65;
        for(int i=rows; i >= 1; i--)
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
        InvertedHalfPyramidPattern ih= new InvertedHalfPyramidPattern();
        ih.halfPyramid(5);
        ih.halfPyramid1(9);
        ih.halfPyramid2(5);
    }
    
}
