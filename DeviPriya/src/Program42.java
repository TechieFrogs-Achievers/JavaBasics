public class Program42 {
    public static void main(String[] args)
    {

        int j,i,k=0;
        int num=5;
        for(j=65+5;j>=65;j--)
        {
            for(i=65;i<j;i++)
            {
                System.out.print((char)i);
            }
            for(i=1;i<k;i++)
            {
                System.out.print(" ");
            }
            for(i=j-1;i>64;i--)
            {
                if(i!=65+5-1)
                {
                    System.out.print((char)i);
                }
            }
            k=k+2;
            if(j!=66)
            {
            System.out.print("\n");
        }
        }
        k=num-1;
        for(j=67;j<=65+num;j++)
        {
            for(i=65;i<j;i++)
            {
                System.out.print((char)i);
            }
            for(i=k;i>0;i--)
            {
                System.out.print(" ");
            }
            for(i=j-1;i>64;i--)
            {
               
                    if(i!=65+num-1)
                {
                    System.out.print((char)i);
                }
               
            }
            k=k-2;
            System.out.print("\n");
        }
   
   
    }
    
}
