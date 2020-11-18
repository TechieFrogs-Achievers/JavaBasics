class Palindrome 
{
    public static void main(String[] args)
    {
        int sum=0,temp=5;
        int n=123;
        temp=n;

        while(n !=0)
      {
          int r;
          r=n%10;  
          sum=(sum*10)+r;
          n=n/10;
      }
      System.out.println(sum);
    }
}
