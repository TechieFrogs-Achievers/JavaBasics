public class Operators
{
    public static void main(String[] args) {
        //Unary Operator
        int x=20;

        // post increment
        System.out.println("Post Increment of x is "+ x++);//20
        System.out.println("Now the value of x is "+x); //21
        
        //pre increment
        System.out.println("Pre Increment of x is "+ ++x);//22
        System.out.println("Now the value of x is "+x);//22
        
        //post decrement
        System.out.println("Post decremnt value of x is "+ x--);//22

        //pre decrement
        System.out.println("Pre decrement value of x is "+ --x);//20

        System.out.println(x++ + ++x + x-- + --x); //20 + 22 + 22 + 20=84

        //Unary Operator for ~ and !  
        
        int y= -11;
        boolean c=true;  
        boolean d=false;  
        System.out.println(~x);//-11   
        System.out.println(~y);//10   
        System.out.println(!c);//false   
        System.out.println(!d);//true  



        //Arithmetic Operator
        int a=30;
        int b=20;

        //Additive Operator
        System.out.println("Addition of a and b "+ (a + b));
        System.out.println("Subtraction of a and b is " +(a - b));

        //Multiplicative Operator
        System.out.println("Multiplication of a and b is" + a * b);
        System.out.println("Division of a and b is "+ a / b);
        System.out.println("Modules operator for a and b is "+ a % b);

        //Shift operator

        int z=30;

        //Right shift
        System.out.println(z >> 3); //30 / 2^3 = 8
        System.out.println(z >> 2);  //30 / 2^2 = 7

        //Left shift
        System.out.println(z << 3);  // 30 * 2^3 =240
        System.out.println(z << 5);  // 30 * 2^5 =960

        //Relational Operators
        int r=20;
        int s=30;
        String str= "eswari";
        System.out.println("Less than operator    " + (r < s));  //20 < 30 = true
        System.out.println("Greater than operator     "+ (r > s));  //20 > 30 = false
        System.out.println("Lessthan or equal to Operator      "+ (r <= s));  //20 <= 30 = true
        System.out.println("Greater than or equal to operator      " + (r >= s)); //20 >=30 = false
        System.out.println("Equal to operator     "+ (r == s));  // 20 == 30  =false
        System.out.println("Not equal to operator   " +(r != s));   //20 != 30  =true
        
        if( str instanceof String)
        {
            System.out.println("str is instane of  string");
        }
        else{
            System.out.println("str is instane of  string");
        }

        //Bitwise Operator
        System.out.println("Bitwise & operator  "+ (r < s & r > s)); //true & false = false
        System.out.println("Bitwise | operator  "+ (r < s | r > s)); //true | false = true
        System.out.println("Bitwise ^ operator  "+ (r < s ^ r > s)); //true ^ false = true

        //Logical operator
        System.out.println("Logical and operator   "+(r < s && r > s));  //true && false= false
        System.out.println("Logical or  operator   "+(r < s || r > s));  //true || false= true

        //Ternary Operator
        System.out.println("Ternary Operator  "+((r < s) ? r : s));  //20 < 30 true(r)

        //Assignment Operator
        System.out.println("+= assignment operator   "+(r += 10));  //20 + 10 =30
        System.out.println("-= assignment operator   "+(s -= 10));  //30 -= 10 =20
        System.out.println("*= assignment operator   "+(s *= 2));   //20 * 2 = 40
        System.out.println("/= assignment operator   "+(r /= 2));   //30 / 2 = 10
        System.out.println("%= assignment operator   "+(s %= 3));   //40 % 3 = 1
        System.out.println("&= assignment operator   "+ (r &= s));  //10 & 0 = 1
        System.out.println("|= assignment operator   "+(r |= s ));   //10 | 0 = 1 
        System.out.println("<<= assignment operator   "+(r <<= 2)); //1 * 2^2 =4
        System.out.println(">>= assignment operator   "+(r >>= 2));  //4 / 2^2 =1

    }

}
       
 
