public class Operators
{
    public static void main(String[] args)
    {
     // arthematic operators

        int a = 12, b = 5;

        // + operator
        System.out.println("a + b = " + (a + b));//17
    
        // - operator
        System.out.println("a - b = " + (a - b));//7
    
        // * operator
        System.out.println("a * b = " + (a * b));//60
    
        // / operator
        System.out.println("a / b = " + (a / b));//2
    
        // % operator
        System.out.println("a % b = " + (a % b));//2

        //unary operator

        int c=7;
        System.out.println(++c + --c - ++c);//8(7) + 6(6) - 7(8)
        System.out.println(c);// 8

        int d=7;
        System.out.println(((--d + --d) + (d-- + --d) * (++d + d++) - (--d + d++)));//11+8*8-8=67
        System.out.println(d);//5

        //assignment operators

        int e=5;
        int age;
        age=e;//assign value by using =

        age+=e;//assign by using +=
        System.out.println(age);//10

        age*=e;//assign by using *=
        System.out.println(age);//50

        //relation operator

        int f=7, g=11;

        // == operator
        System.out.println(f == g);  // false

        // != operator
        System.out.println(f != g);  // true

        // > operator
        System.out.println(f > g);  // false

        // < operator
        System.out.println(f < g);  // true

        // >= operator
        System.out.println(f >= g);  // false

       // <= operator
       System.out.println(f <= g);  // true

       //bitwise operator
       int h=23, i=-4, j=10;
       System.out.println(h^j);//29
       System.out.println(h&j);//2
       System.out.println(h|j);//31
       System.out.println(h<i&h>j);//false
       System.out.println(h>i|h>j);//true

       //logical operators

       System.out.println(h<i&&h>j);//false
       System.out.println(h>i||h<j);//true

       //shift operators
       byte x=10,y=-20;
       System.out.println("Bitwise Left Shift: x<<2 = "+(x<<2));//40
       System.out.println("Bitwise Right Shift: x>>2 = "+(x>>2));//2
       System.out.println("Bitwise Left Shift: y<<2 = "+(y<<2)); //-80 
       System.out.println("Bitwise Right Shift: y>>2 = "+(y>>2));//-5

       //ternary operators
        int k=10;
        int l=3;
         float max=(k > l)? k : l;
         System.out.println(max);//10.3

         short min= (short) ((k < l) ? k : l);
         System.out.println(min);




       

    





    }

    


}