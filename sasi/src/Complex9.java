public class Complex9
 {
     void addComplex(int real1,int real2,int imag1,int imag2)
     {
    int realnum=real1-real2;
    int imagnum=imag1-imag2;
    System.out.println("real numbers"+realnum);
    System.out.println("imag number"+imagnum);
}
void multiplyComplex(int real1,int real2,int imag1,int imag2)
{
    int realnum=real1*real2;
    int imagnum=imag1+imag2;
    System.out.println("real num:"+realnum);
    System.out.println("imagnum:"+imagnum);
}
public static void main(String[] args)
 {
     Complex9 c=new Complex9();
     c.addComplex(1,2,7,9);
     c.multiplyComplex(2,6,7,9);
 }
}