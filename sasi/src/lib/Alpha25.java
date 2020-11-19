class Alpha25
{
    public static void main(String[] args)
    {
        int count=1;
        int row=1,alphabet=65;
        for(int i=1;i<=5;i++)
        {
            if(i%2==0)
            {
                int rev=row+count-1;
                for(int j=0;j<i;j++)
                {
                    System.out.println((char)(rev+alphabet-1)+" ");
                    rev--;
                    count++;
                }
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.println((char)(count+alphabet-1)+" ");
                    count++;
                }
             }
             System.out.println();
             row++;
            }
        }
    }