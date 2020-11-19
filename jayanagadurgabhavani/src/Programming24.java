public class Programming24 
{
    public static void main(String[] args)
     {
        int rows=5;
        for(int i=5;i>=1;--i)
        {
            for(int space = 1;space<=(rows-i);++space)
            {
                System.out.print("  ");

            }
            for(int j=0;j<(i*2)-1;++j)
            {
                System.out.print( "* " );
            }
            System.out.println();
        }
    }
}
