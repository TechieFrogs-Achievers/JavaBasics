public class operators {
    public static void main (String args[])
    {
    //Arithmetic operators
    int a=20;
    int b=10;
    System.out.println("a+b ="  +(a+b) );//30
    System.out.println("a-b ="  +(a-b));//10
    System.out.println("a*b ="  +(a*b));//200
    System.out.println("a/b)="  +(a/b));//2
    System.out.println("a%b="   +(a%b));//0
     
    //unary operators
     int x=30;
     System.out.println(x++);//30(31)
     System.out.println(x);
     System.out.println(++x);//32
     System.out.println(x--);//32(31)
     System.out.println(x);
     System.out.println(--x);//30

     int p=10;
     int q=40;
     System.out.println(p++ + ++p);//10+12=22 
     System.out.println(p); 
     System.out.println(q-- - --q);//40-38=2

     //unary operator ! & ~
     boolean d=false;
     boolean e=true; 
     int y=20;
     int z=-30;
     System.out.println(!d);//true
     System.out.println(!e);//false
    System.out.println(~y);//-21(minus of positive numbers starts from 0)
    System.out.println(~z);//29(positive of total minus from 0)
     
    //shift operator 

    //left operator << 
    System.out.println(10<<2);//10^2^2=40
    System.out.println(30<<4);//30^2^4=480

    //right operator>>
    System.out.println(10>>5);//10/5=0
    System.out.println(30>>6);//30/6=0

    //Relational operator
    int g=10;
    int f=12;
    System.out.println(g==f);//false
    System.out.println(g!=f);//true
    System.out.println(g>f);//false
    System.out.println(g<f);//true
    System.out.println(g>=f);//false
    System.out.println(g<=f);//true

    //ternary operators
    int m=10;
    int n=20;
    int val=(m<n)?m:n;
    System.out.println(val);//10

    //logical operator

    //&& operator
    System.out.println((4>5)&&(7<3));//false
    System.out.println((4<5)&&(7>3));//true

    //|| operator
    System.out.println((2<4)||(8>3));//true
    System.out.println((2>3)||(8<5));//false

    //! operator
    System.out.println(!(8==3));//true
    System.out.println(!(10<4));//false

    //assignment operator
     b+=a;
     System.out.println("b + = a =" +b);//30
     b-=a;
     System.out.println("b - = a =" +b);//10
     b*=a;
     System.out.println("b * = a =" +b);//200
     b/=a;
     System.out.println("b / = a =" +b);//10
     b%=a;
     System.out.println("b % = a =" +b);//10

     //bitwise operator

       System.out.println(a>b & a<b );//false
       System.out.println(a>b | b<a);//true
       System.out.println(a^b );//30
       System.out.println(~a );//-21


            }
    
}
