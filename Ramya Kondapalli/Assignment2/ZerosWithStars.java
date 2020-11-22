public class ZerosWithStars {
    public static void main(String[] args) {
        int rows =3,columns=8;
        //assign values for rows and columns
        for(int i=0;i<=rows;i++)
        {
            System.out.println();
            for(int j=0;j<=columns;j++)
            {
                if(j==i || j==(columns/2) || j==columns-i)
                System.out.print("*");
                else
                System.out.print("0");
            }
        }
    }
}
