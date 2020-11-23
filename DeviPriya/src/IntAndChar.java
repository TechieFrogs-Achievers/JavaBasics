public class IntAndChar { 
    public static int iac(int n,char c)
    
    {
       return n&c;

    }
    public static int iac(char c,int n)
    {
        return c&n;

    }

    public static void main(String args[]) {
      System.out.println( IntAndChar.iac(5,'p')); 
       System.out.println( IntAndChar.iac('p',5));
    }


}
