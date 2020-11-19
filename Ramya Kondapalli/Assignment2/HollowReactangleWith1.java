public class HollowReactangleWith1 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            System.out.println();
            for(int j=1;j<=10;j++)
            {
                if (i==1 || i== 10 || j==1 || j==10  )
                System.out.print("1");
                else
                System.out.print(" ");
            }
        }
    }
}
