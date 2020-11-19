class Operaters
 {
     public static void main(String []ed)
     {
        float a=2f,b=4f;
        int c=5,d=7;
        boolean e=false;
        char s='f';
      
     //Arithmetic operations(+,-,*,/,%)
     System.out.println("addition of no's       :" + (a+s)); //2+102
     System.out.println("substraction of no's   :" + (c-d)); //-2
     System.out.println("multiplication of no's :" + (a*b)); //8.0
     System.out.println("division of no's       :" + (a/b)); //0.5
     System.out.println("modulus of no's        :" + (a%b)); //2.0

     //inc,Dec operations(++,--,~,!)
     System.out.println("post increment         :" + a++);     //2.0(3.0)
     System.out.println("pre increment          :" + ++c);     //6
     System.out.println("post decrement         :" + c--);     //6(5)
     System.out.println("pre decrement          :" + --c);     //4
     System.out.println("pre decrement          :" + --s);     //e
     System.out.println("unary operaters        :" + (++d + d-- - ++c));//(8) +(7) -(4)=11
     System.out.println("boolean value          :" + !e);      //true 
     

     //shift operations(<<,>>)
     System.out.println("left shift             :" + (c>>s));  //(5/2^7=0)
     System.out.println("right shift            :" + (c<<d));  //(5*2^7=640)

     //relational operations(==,!=,<=,>=,<,>)(o/p: t/f)
     System.out.println("equal or not           :" + (a==b));  //false
     System.out.println("less than or not       :" + (a<=b));  //true
     System.out.println("greater than or not    :" + (a>=b));  //false 
       
     //logical operations(&&,||)(o/p: t/f)
     System.out.println(" logical and           :" + ((c==s) && (c<=d))); //false
     System.out.println("logical or             :" + ((c==s) || (c<=d))); //true
     
      
     //bitwise operations(&,|)(performs on bits)
     System.out.println("bitwise and            :" + ((c==8) & (++d==0))); //false
     System.out.println("bitwise or             :" + ((c==8) | (++d==0))); //false
     System.out.println("bitwise and            :" + (c&s));               //103
     System.out.println("bitwise or             :" + (c|d));               //13
     System.out.println("cap                    :" + (s^d));               //97
      
     //ternery operation
     float greatestValue= (c/2)>d ? c:d;
     int  greatestValue1= (int)((a/2)<b ? a:b)
     ;

     System.out.println("greatest value is      :" + greatestValue);         //7.0
     System.out.println("greatest value is      :" + greatestValue1); 

     //Assignment operaters
     System.out.println("                       :" + (a+=b));              //6.0
     System.out.println("                       :" + (a/=b));              //1.5
     
     }
    
}
