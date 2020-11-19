public class Operators {

 //Arithmetic operators//

      public static void main(String args[])

     {
        int a = 10;
        int b = 20;
        int c = 25;
        System.out.println("a + b = " + (a + b) ); //30
        System.out.println("a - b = " + (a - b) ); //-10
        System.out.println("a * b = " + (a * b) ); //200
        System.out.println("b / a = " + (b / a) ); //2
        System.out.println("b % a = " + (b % a) ); //0
        System.out.println("c % a = " + (c % a)); //5

//Relational operators//

        System.out.println("a == b = " + (a == b) ); //false
        System.out.println("a != b = " + (a != b) ); //true
        System.out.println("a > b = " + (a > b) ); //flase
        System.out.println("a < b = " + (a < b) ); //true
        System.out.println("b >= a = " + (b >= a) ); //true
        System.out.println("b <= a = " + (b <= a) );  //false


//Bitwise operator//


    
       System.out.println(a<b & b>a );//true
       System.out.println(a>b | b<a  );//false
       System.out.println(a ^ b  );// 30
       System.out.println(~a  ); //-11
     

//Uniary operator pre and post inc//

      System.out.println(a++);//10
      System.out.println(++b);//21
      System.out.println(a--);//11 
      System.out.println(--b);//20


//Logical operators//

      boolean x = true;
      boolean y= false; 
      System.out.println("x && y = " + (x&&y)); //false
      System.out.println("x || y = " + (x||y) ); //true
      System.out.println("!(x && y) = " + !(x && y)); //true

//Shift operators//

      System.out.println(10<<2);//40/10*2^2=10*4=40 (left shift)
      System.out.println(10>>2);//2/10/2^2=10/4=2    (right shift)
     
//Ternary operator//
      int m=9;
      int n=3;
      int min=(m<n)?m:n;  
      System.out.println(min);  //3(false)

//Assignment operator//

      b += a ; 
      System.out.println("b += a = " + b );//30
      b-= a ; 
      System.out.println("b -= a = " + b);//30
      b*= a ; 
      System.out.println("b *= a = " + b );//200
       b /= a ; 
      System.out.println("b /= a = " + b ); //20
       b %= a ;
      System.out.println("b %= a = " + b); //0

}
}