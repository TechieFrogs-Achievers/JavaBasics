public class Complex {

    void addComplex(int real1,int real2,int imag1,int imag2){
        int realnum=real1+real2;
        int imaginarynum=imag1+imag2;
        System.out.println("realnumber:"+realnum);
        System.out.println("imaginarynumber:"+imaginarynum);
    
    }
    void subComplex(int real1,int real2,int imag1,int imag2){
        int realnum=real1-real2;
        int imaginarynum=imag1-imag2;
        System.out.println("realnumber:"+realnum);
        System.out.println("imaginarynumber"+imaginarynum);
    }
    void multiplyComplex(int real1,int real2,int imag1,int imag2){
        int realnum=real1*real2;
        int imaginarynum=imag1+imag2;
        System.out.println("realnumber:"+realnum);
        System.out.println("imaginarynumber:"+imaginarynum);
    }
    public static void main(String[] args) {
        Complex c=new Complex();
        c.addComplex(1,20,30,40);
        c.subComplex(40,20, 80, 50);
        c.multiplyComplex(10, 56, 72, 46);
    }
    
}
