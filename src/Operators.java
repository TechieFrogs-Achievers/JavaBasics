public class Operators {

    public static void main(String args[]) 
    {
        /*// unary operators
        int a=20, b=40;
        float c=2.4f, d=4.3f;
        System.out.println(a++); //20
        System.out.println(++a); //22
        System.out.println(--b); //39
        System.out.println(b--); //39
        System.out.println(c++); //2.4
        System.out.println(++c); //4.4
        System.out.println(d--); //4.3
        System.out.println(--d); //2.3000002
        //System.out.println("unary operator " + ++b + a-- - ++b ); //ERROR 
        System.out.println(~10); //-11*/
        

        /*//Arithmetic operators
        int m=8,n=4;
        float p=0.8f,r=0.4f;
        System.out.println(m+n);  //12
        System.out.println(p*r);  //0.32000002
        System.out.println(m*n);  //32
        System.out.println(m/n);  //2
        System.out.println(p%r);  //0.0*/

       /* //Relational opertors
        int x=5;
        int y=10;
        float z=2.4f;
        System.out.println(x == y);  //false
        System.out.println(z != y);  //True
        System.out.println(x > y);   //false
        System.out.println(x < y);   //true
        System.out.println(x >= z);  //true
        System.out.println(x <= y);  //true
        System.out.println(x > z);   //true

        //logical operators
        int a=10;
        int b=20;
        float c=0.2f;
        System.out.println((a>b) && (a<b));
        System.out.println((a>b) || (a<b));
        System.out.println( !(a == b) );
        //System.out.println((a>b) && c)); ---ERROR
        System.out.println(! (true));  //false
        

        //Bitwise operators
        System.out.println(5 & 3); //1 
        System.out.println(4 | 2);  //6
        System.out.println(~9);  //-10
        System.out.println(10 ^ 20); //30*/
        

        //shift operators
        //LEFT shift
        int a= 10,b=20;
        System.out.println(a<<b); //10485760
       System.out.println(4<<2); //16
       System.out.println(20<<4); //320
       //System.out.println(3.2f << 2);  //ERROR

       //RIGHT shift
       System.out.println(5>>4);  //0
       System.out.println(9>>3);  //1
       //System.out.println(4.5 >> 2);  //ERROR

      /* //ternary operators
       int k=6,l=9;
       //float a=2.4f,b=5.4f;
       int value=(k>l)?k:l;
       float data=(k>l)?k:l;
       //int value1 = (a>b)?a:b;  //ERROR--TYPE MISMATCH
       System.out.println(value); //9
       System.out.println(data);  //9.0
       System.out.println(value);  //9 
       int value3 = (int)((a<b)?a:b);  //type conversion 
       System.out.println(value3); //28*/

       //Assignment operator
       int p=6;
       //float m= 0.2f;
       //double n=9.8d;
       System.out.println(p); //6
       

    }
}
