public class HollowReactangleWith1 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            System.out.println();
            for(int j=1;j<=10;j++)
            {
                //using if condition to print '1' in order to print hollow raectangle with'1's'.. 
                if (i==1 || i== 10 || j==1 || j==10  )
                System.out.print("1");
                else
                //if condition not satisfy print space at that place
                System.out.print(" ");
            }
        }
    }
}
