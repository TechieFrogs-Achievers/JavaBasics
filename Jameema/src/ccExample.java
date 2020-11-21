public class ccExample
 {
     int x,y;
     ccExample()
     {
         this(6);
         System.out.println("default constructor");
     }
     ccExample(int c)
     {
         this(5,6);
         x=c;
         System.out.println(c++);
     }
     ccExample(int a, int b)
     {
         x=a ;
         y=b;
         System.out.println(x*y);
     }
     ccExample(int a , int b , int h)
     {
         x=a;
         y=b;
         System.out.println(x-y-h);
     }
     public static void main(String[] args)
      {
          new ccExample();
          new ccExample(9,5,6);
         
     }

    
}
