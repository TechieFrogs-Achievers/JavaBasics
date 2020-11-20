public class Swap 
{
    public static void main(String[] args) 
    {
        int b = 230;
        int  a = 150;
        System.out.println("before swap");
        System.out.print("before char = " +b);
        System.out.print("before int = " +a);
        int T= b;
         b = a;
         a = T;
         System.out.println("after swap");
         System.out.print(" after swap char =" +b);
         System.out.print("after swap int =" +a);
    
        
      //without using temporary variable
         int x=12,y=10;
         x = x+y;
         y = x-y;
         x = x-y;
             System.out.println("after swapping" +x  +" " +y);
    }
}
