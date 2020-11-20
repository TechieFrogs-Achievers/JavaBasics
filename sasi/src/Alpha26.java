public class Alpha26 
{
    public static void main(String[] args)
     {
         int count=1;
         int alphabet=65;
         int row=1;
         for(int  i=1;i<=5;i++)
         {
             if(i%2==0)
             {
                 for( int j=1;j<=i;j++)
                 {
                     System.out.print((char)(count+alphabet-1)+" ");
                     count++;
                 }
                }
                else
                {
                    int rev=row+count-1;
                    for(int j=0;j<i;j++)
                    {
                        System.out.print((char)(rev+alphabet-1)+" ");
                        rev--;
                        count++;
                    }
                }
                System.out.println();
                row++;
         }
    }
}
