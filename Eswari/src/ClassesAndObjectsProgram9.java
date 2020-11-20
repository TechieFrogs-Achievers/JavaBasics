class Complex
{
    // float real,imaginary;  
    // Complex(float r,float i)
    // {
    //     real=r;
    //     imaginary = i;
    // }
    public void add(double d, double e, double f, double g) {
        double realNum = d + f;
        double imgNum = e + g;
        System.out.println("Real Number "+realNum +"     "+"Imaginary Number" +imgNum);
    }

    public void difference(double real1, double imag1, double real2, double imag2)
    {
        double realNum = real1 - real2;
        double imgNum = imag1 - imag2;
        System.out.println("Real Number "+realNum +"    " +"Imaginary Number" +imgNum);
    }

    public void product(double real1, double imag1, double real2, double imag2)
    {
        double realNum = real1 * real2;
        double imgNum = imag1 * imag2;
        System.out.println("Real Number "+realNum +"     "+"Imaginary Number" +imgNum);
    }
}

public class ClassesAndObjectsProgram9 {
    public static void main(String[] args) {
        Complex c= new Complex();
        c.add(2.2,5.2,6.2,8.2);
        c.difference(5.2, 4.3, 1.0, 4.2);    
        c.product(.2, 8.2, 1.4, 6.1);
    }
    

        
}