public class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            System.out.println();
                for(int j=5;j>=1;j--)
                {
                     if(j == i)
                        System.out.print("*");    //If j==i then print *
                    else
                    System.out.print(j);    //if j != i print numbers
                }
        }
    }
}


