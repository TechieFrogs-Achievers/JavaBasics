    public class Spiral 
    {
        public static void main(String args[])
        {
            int n=5;
            int[][] a= new int[5][5];
            int i;
            int j;
            int ot;

            int x=0;
            int y=0;
            int z=1;
            for(ot=0;ot<=n/2;ot++)
            {
                if(ot==n/2)
                {
                    z--;
                }
                for(j=y;j<n-y;j++)
                {
                    a[x][j]=z;
                    z++;
                }       
                
                for(i=x+1;i<n-x-1;i++)
                {
                    a[i][n-y-1] = z;
                    z++;
                }
                for(j=n-y-1;j>=y;j--)
                {
                    a[n-x-1][j]=z;
                    z++;
                }
                for(i= n-x-2;i>x;i--)
                {
                    a[i][j] = z;
                    z++;

                }
                x++;
                y++;
            

            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.printf(" %02d",a[i][j]);
                }
                System.out.println();
            }
        }
        
    }
