public class HalfPyramidUsingStars {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)  //outer loop
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("  ");  //for spaces
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");   //for stars 
            }
            System.out.println();
        }
    }
}
