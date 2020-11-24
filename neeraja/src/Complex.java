public class Complex 
{
    int Real,Imag;

    Complex()
    {}

    //parameterized constructor
    public Complex(int Real1,int Imag1)
    {
    Real=Real1;
    Imag=Imag1;
    }

    //method to perform addition operation
    Complex AddComplex(Complex C1,Complex C2)
    {
    Complex CSum=new Complex();
    CSum.Real=C1.Real+C2.Real;
    CSum.Imag=C1.Imag+C2.Imag;
    return CSum;
    }

    //method to perform substraction operation
    Complex SubComplex(Complex C1,Complex C2)
    {
    Complex CSub=new Complex();
    CSub.Real=C1.Real-C2.Real;
    CSub.Imag=C1.Imag-C2.Imag;
    return CSub;
    }

    //method to perform multiplication operation
    private Complex multiplication(Complex C1, Complex C2)
    {
    Complex Cmul=new Complex();
    Cmul.Real=(C1.Real*C2.Real)+(C1.Real*C2.Imag);
    Cmul.Imag=(C1.Imag*C2.Imag)+(C1.Imag*C2.Real);
    return Cmul;
    }
    
     
     public static void main(String[] a)
    {
     
    //creating objects with fields values
    Complex C1=new Complex(4,5);
    Complex C2=new Complex(7,4);
    Complex C3=new Complex();
   
    //method call for adition
    C3=C3.AddComplex(C1,C2);
    System.out.println("SUM iS             :" + C3.Real +"+i" + C3.Imag);

    //method call for substraction
    C3=C3.SubComplex(C1,C2);
    System.out.println("SUbstraction  iS   :" + C3.Real +"+i" + C3.Imag);

    //method call for multiplication
    C3=C3.multiplication(C1,C2);
    System.out.println("Multiplicaction  iS:" + (C3.Real + C3.Imag));
     }

}

