public class Operators {

    
    public static void main(String[] args)
     {
         //unary operator
        int x = 5;
        int y = 9;
        System.out.println(x++);//5(6)
        System.out.println(++x);//7
        System.out.println(x--);//7(6)
        System.out.println(--x);//5
        System.out.println(x++ + ++x);//5+7=12
        System.out.println(y-- + --y);//9+7=16
        System.out.println(x++ + --y);

        int i=5;
        int j=-9;
        boolean k = true;
        boolean l = false;
        System.out.println("i value is ="  + ~i);//  - of positive numbers start from zero
        System.out.println("j value is =" + ~j);//8   + of total numbers start from zero
        System.out.println("k value is =" + !k);//false
        System.out.println("l value i s=" + !l);//true

        //Arithmetic operator
        int a=30;
        int b=25;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);

        //shift operators
        
        //left shift operators
         System.out.println(10<<5);//positive number  (10*2^5=10*32=320)
         System.out.println(-10<<5);//negative number (-10*2^5=-10*32=-320)

         //right shift operator
         System.out.println(10>>5);//positive number (10/2^5=10/2=0)
         System.out.println(-10>>5);//negative number (-10/2^5=-10/32=-1)
        
         //logical  operator
         
         int m = 6;
         int n = 7;
         int p = 10;
         System.out.println ( m<n && m<p );//true && true=true
         System.out.println ( m<n && m++<p );//true && true = true
         System.out.println ( "increment logical m value is=" +m );
         System.out.println ( m<n || m<p);//true
         System.out.println ( m<n || m++<p );//true
         System.out.println ( "decrement  logical m value is ="+m);

         // Bitwise operator

         System.out.println ( m<n & m<p );//true & true =false
         System.out.println ( m<n & m++<p );//true & true = false
         System.out.println (" increment  bitwise m value is ="+ m );
         System.out.println ( m<n | m<p );//false | true = true
         System.out.println ( m<n | m--<p);// false | true =true
         System.out.println (" decrement bitwise  m value is=" +m );

         //ternary operator

         int e=10;
         int f=20;
         int num =(e<f)?e:f;//true (it prints e value )
         System.out.println( "the num value is :" +num );

         //assignment operator

         int s = 20;
         s+=10;//20+10=30
         System.out.println(s);
         s-=5;//30-5=25
         System.out.println(s);
         s*=8;//25*8=200
         System.out.println(s);
         s/=7;//200/7=28
         System.out.println(s);

         //Relational operator

         int u = 9;
         int v = 8;
         String str = "shirin";
         System.out.println("lessthan value is = " +(u < v));    // 9 < 8 = false
         System.out.println("greaterthan value is = " + (u >v ));    // 9 > 8 = true
         System.out.println("lessthan equal to operator is =" +(u <= v));   // 9 < = 8 false
         System.out.println("greaterthan equal to operatoe is =" +(u >= v)); // 9 >= 8  true
         System.out.println("Equal operator is = " +(u == v));               // 9 == 8  false
         System.out.println("Not equal operator is =" + ( u!=v));            // 9 != 8 true
         System.out.println(str);


         

        



        
    

     

    }
    
}
