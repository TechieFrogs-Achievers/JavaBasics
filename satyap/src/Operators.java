public class Operators {
    public static void main(String args[])
    {

     int a=50;
     int b=30;
     // Arithmetric Operators
     System.out.println(a+b); // 50+30=80
     System.out.println(a-b); // 50-30=20
     System.out.println(a*b); // 50*30=1500
     System.out.println(a/b); // 50/30=1
     System.out.println(a%b); // 50&30=20
    
    //Left shift and right shift operator
     System.out.println(10<<2);//10*2^2=10*4=40
     System.out.println(10<<3);//10*2^3=10*8=80
     System.out.println(20<<4);//20*2^4=20*16=320
     System.out.println(10>>2);//10/2^2=10/4=2
     System.out.println(10>>3); //10/2^3=10/8=1

     //Bitwise Operator && and Logical Operator &
     int c=20;
     System.out.println(a<b && a<c);// false=false
     System.out.println(a);//50
     System.out.println(a<b & a<c);//false & false=false
     System.out.println(a<b && a++<c);//false=false
     System.out.println(a);//50
     System.out.println(a<b & a++<c);// false & false=false
     System.out.println(a);// 51

     //Bitmwise Operator | and Logical Operator |
     System.out.println(a>b||a>c); //true=true 
     System.out.println(a>b|a>c);  //true|true=true
     System.out.println(a>b||a++>c); //true=true
     System.out.println(a); //51
     System.out.println(a>b|a++>c); //true|true=true
     System.out.println(a); //52
     
     //Ternary Operator
     int min=(a<b)?a:b;
     int max=(a>b)?a:b;
     System.out.println(min); //b=30
     System.out.println(max);// a=52

     //Assignment Operator
     a=a+b;
     System.out.println(a);// 52+30=82

     // type cast of assignment Operator
     a=(short)(a+b);// 82+30=112
     System.out.println(a);

     System.out.println(b+=1);// 30+1=31
     System.out.println(b-=2);//31-2=29
     System.out.println(b*=2);//29*2=58
     System.out.println(b/=2);//58/2=29
     System.out.println(b%=2);//29%2=1

     // Relational Operator
     System.out.println("a==b" +"-"+(a==b));
     System.out.println("a!=b" +"-"+(a!=b));
     System.out.println("a>b" +"-"+(a>b));
     System.out.println("a<b"+"-" +(a<b));
     System.out.println("a>=b"+"-" +(a>=b));
     System.out.println("a<=b"+"-" +(a<=b));


    }
}