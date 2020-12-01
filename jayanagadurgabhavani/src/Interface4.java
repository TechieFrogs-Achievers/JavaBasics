interface Implicitly
{
    void visi();
}
class Implici implements Implicitly
{  
    int a;
   public int b;
   final int c;
   
   // Implici(int a, final int b, final int c, final int d)
    {
    int roll =a;
    int door=b;
    int phone=c;
    
    }
   public void visi()
       {
          System.out.println("int a:"+" ");
          System.out.println("public int b:"+ " ");
          System.out.println("public stati final int c:"+ " ");
          System.out.println("final int d:"+ " ");
          System.out.println("static int e:"+" ");
       }
}
public class Interface4
{
    public static void main(String[] args)
     {
        Implicitly i= new Implici(10,10,10);
          i.visi();
        
    }
}