public class Operators 
{
    public static void main(String[] args)
    {
        System.out.println("Unary Operators");
        int h = 5;  // local variable
        System.out.println("h = :" + h++);  // post increment  5
        System.out.println("h = :" + h);  // 6
        System.out.println("h = :" + ++h); // pre increment 7
        System.out.println("h = :" + h);  // 7
        System.out.println("h = :" + h--); // post decrement 7
        System.out.println("h = :" + h);  // 6
        System.out.println("h = :" + --h); // pre decrement 5
        System.out.println("h = :" + h); // 5
        
        System.out.println("Arithmatic Operators");
        int a = 9;
        int b = 3; // local variables
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Addition = :" + add); // adding of two numbers
        System.out.println("Subtraction = :" + sub); // subtraction of two numbers
        System.out.println("Multiplication = :" + mul); // multiplication of two numbers
        System.out.println("Division = :" + div); // division of two numbers
        System.out.println("Modulus = :" + mod); // modulus of two numbers

        System.out.println("Shift Operators");
        int k = 20 ;
        System.out.println(k << 3); // left shift 20*2^3=160
        System.out.println(k >> 2); // right shift 20/2^2=5

        System.out.println("Logical and Bitwise Operators");
        int bag = 21 ;
        int pen = 26 ;
        int book = 28 ;
        System.out.println(pen < bag && bag++ < book); // false && true = false
        System.out.println(bag); // 21
        System.out.println(++pen > --book || bag < book); // false || true = true
        System.out.println(book); // 28-1=27
        System.out.println(book < bag & pen++ < book); // false & true = false
        System.out.println(pen);
        System.out.println(pen < bag | ++bag > book);
        System.out.println(bag);

        System.out.println("Ternary Operator");
        int d = 41 ;
        int q = 57 ;
        int z = (d < q)?d:q;
        System.out.println(z);

        System.out.println("Assignment Operator");
        int r = 4;
        r += 5;
        System.out.println(r);
    }
}
