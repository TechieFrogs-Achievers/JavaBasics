public class Fullpyramid {
    public static void main(String[] args) {
        int i, j, k, r=5;
        for(i=1;i<=r;i++)
        {
            for (j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=((2*i)-1); k++)
            {
                System.out.print("*" );
            }
            System.out.println();
        }

        //inverted pyramid

        for(i=r;i>=1;i--)
        {
            for(j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=((2*i)-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}
