public class Complex1 
{
    void addcomplex1(int real1, int real2, int imag1, int imag2)
    {
        int realnum= real1+real2;
        int imaginarynum= imag1+imag2;
        System.out.println("realnumber:"+realnum);
        System.out.println("imaginarynumber:" +imaginarynum);



    }
    void subComplex1(int real1,int real2,int imag1,int imag2)
    {
        int  realnum=real1-real2;
        int imaginarynum=imag1-imag2;
        System.out.println("realnumber:"+realnum);
        System.out.println("imaginarynumber"+imaginarynum);
    }
    void multiplyComplex1(int real1,int real2,int imag1,int imag2)
    {
        int realnum= real1*real2;
        int imaginarynum=imag1*imag2;
        System.out.println("realnumber:"+realnum);
        System.out.println("imaginarynumber:"+imaginarynum);

    }
    public static void main(String args[])
    {
        Complex1 c=new Complex1();
        c.addcomplex1(1, 20, 30, 50);
        c.subComplex1(40,30,20,50);
        c.multiplyComplex1(10,35,56,74);
    }
}
