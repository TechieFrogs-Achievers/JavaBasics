public class Pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            System.out.println();
            for(int j=1;j<=6;j++)
            {
                if(j == i || j==4-i)
                System.out.print(j);
                else 
                System.out.println(" ");
            }
        }
    }
}
