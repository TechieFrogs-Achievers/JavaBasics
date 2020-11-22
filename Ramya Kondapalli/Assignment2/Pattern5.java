public class Pattern5 {
    public static void main(String[] args) {
        //for upper part 
        for(int i=1;i<=4;i++)
        {
            System.out.println();
            for(int j=1;j<=7;j++)
            {
                //if this conditions satisfy i value will printsss
                if(j == i || i+j==8)
                System.out.print(i);
                else 
                System.out.print(" ");
            }
        }
        //for lower part
        for(int i=3;i>=1;i--)
        {
            System.out.println();
            for(int j=1;j<=7;j++)
            {
                if(j==i || i+j==8)
                System.out.print(i);
                else
                System.out.print(" ");
            }
        }
    }
}
