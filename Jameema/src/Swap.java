public class Swap
 {
     public static void main(String[] args)
      {
          String a="java" , b="c++";
          String t;
          //using temprarory
          System.out.println("before swapping  : " +a+ "  and  "  +b);
          t=a;
          a=b;
          b=t;
          System.out.println("after swapping  :" +a+"  and  "  +b);

         // without using temprarory 

         int x=10 , y=56;
         System.err.println("before swapping :"+x+"  and  " +y);
        
          x=x+y;
          y=x-y;
          x=x-y;
         
          System.out.println("after swapping :" +x+"  and  " +y );

         
     }
    
}
