public class UnaryOperator 
{
    public static void main(String args[])
    {
      //Unary Operators
      
      int a=10;
      int b=20;
      System.out.println(a++);//10(11)
      System.out.println(++a);//12
      System.out.println(b--);//20(19)
      System.out.println(--b);//18
      System.out.println(a++ + ++a);//12+14=26
      System.out.println(b-- - --b);//18-16=2
      System.out.println(a++ + b++);//14+16=30
      

      //Unary operators for ~ ,!
      
      boolean c=true;
      boolean d=false;
      System.out.println(~a);
      System.out.println(~b);
      System.out.println(!c);
      System.out.println(!d);
      

     
    }
    
}
