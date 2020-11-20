public class GcdNumbers
{
    public static void main(String[] args) 
    {
       int n1=12,n2=8,gcd=1;
      for(int i=1;i<=n1 && i<=n2;++i)
      {
          if((n1 % i==0) && (n2 % i==0))
          {
              gcd=i;
          }
      }
      System.out.println("G.C.D of "+n1+"and"+n2+" is "+gcd);  
    //by using while loop
    int i=1;
    while(i<=n1)
    {
        if((n1 % i==0) && (n2 % i==0))
        {
            gcd=i;
        }
        ++i;
       
    }
    System.out.println("G.C.D of "+n1+"and"+n2+" is "+gcd);


    }

}
