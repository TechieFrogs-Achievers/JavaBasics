public class LCMNumbers
{
    public static void main(String[] args)
    {
        int n1 =5, n2 = 12, gcd=1;
        //by uisng for loop
        for(int i=1;i<=n1 && i<=n2;++i)
        {
            //chekes if i is factor of both integers
            if(n1 %i == 0 && n2 % i==0)
                gcd=i;
        }   
            int lcm=(n1 * n2)/gcd;
            System.out.println("the LCM of "+n1+"and "+n2+" is:"+lcm);

        //by using while loop
        int i=1;
         while(i<=n1 && i<=n2)
         {
            if(n1 %i == 0 && n2 % i==0)
            gcd=i;  
         }
         ++i;
         int lcm1=(n1 * n2)/gcd;
         System.out.println("the LCM of "+n1+"and "+n2+" is:"+lcm1);

    }
}
