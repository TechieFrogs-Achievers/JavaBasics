class Complex {
    //methods for calculating sum,difference and product
    public void sum(int real1,int real2,int imaginary1,int imaginary2)
    {
        int realNum = real1 + real2;
        int imaginaryNum = imaginary1+ imaginary2;
        System.out.println(realNum + "+" + imaginaryNum + "i" );
    }
    public void difference(int real1,int real2,int imaginary1,int imaginary2)
    {
        int realNum = real1 - real2;
        int imaginaryNum = imaginary1 - imaginary2;
        System.out.println(realNum + "-" + imaginaryNum + "i" );
    }
    public void product(int real1,int real2,int imaginary1,int imaginary2)
    {
        int realNum = real1 * real2;
        int imaginaryNum = imaginary1 * imaginary2;
        System.out.println(realNum + "+" + imaginaryNum + "i" );
    }
}
public class ConstructorProgram9 {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.sum(4,2,3,1);  //sum method calling
        c.difference(5,3,8,7);  ////difference method calling
        c.product(1,2,3,4);  //product method calling
    }
}
