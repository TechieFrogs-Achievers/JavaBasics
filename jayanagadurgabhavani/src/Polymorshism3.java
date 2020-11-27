public class Polymorshism3 
{
    void sub(int a, int b)
    {
      System.out.println("sub:"+ (a-b));//subtration
    }
    void mul(double a, double b)
    {
        System.out.println("mul:"+(a*b));//multipiction
    }
    void String(String str1, String str2)
    {
        System.out.println("string:"+(str1+str2));//string concodhition
    }
    public static void main(String[] args) {
        Polymorshism3 pl=new  Polymorshism3 ();
        pl.sub(44,44);//asseding value
        pl.mul(2345.456d,2345.5678d);//assedhing valu
        pl.String("jaya", "anu");
    }
}
