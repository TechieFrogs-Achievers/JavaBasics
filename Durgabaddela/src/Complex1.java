import java.util.Scanner;

public class Complex1
{
    //method for sum of two complex numbers

   public void sum(int real1, int real2, int imaginary1, int imaginary2) 
   {
       int realNumber = real1+real2;
       int imaginaryNumber = imaginary1+imaginary2;
       System.out.println(realNumber+"+"+imaginaryNumber+"j");
   }

   //method for difference of two complex numbers

   public void difference(int real1, int real2, int imaginary1, int imaginary2) 
   {
       int realNumber = real1-real2;
       int imaginaryNumber = imaginary1-imaginary2;
       System.out.println(realNumber+"+"+imaginaryNumber+"j");
   }

   //method for product of two complex numbers

   public void product(int real1, int real2, int imaginary1, int imaginary2) 
   {
       int realNumber = real1*real2;
       int imaginaryNumber = imaginary1*imaginary2;
       System.out.println(realNumber+"+"+imaginaryNumber+"j");
   }
   public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       
       //creating an object for instance class

       Complex1 c1 = new Complex1();
       c1.sum(a, b, c, d);
       c1.difference(a, b, c, d);
       c1.product(a, b, c, d);


   }
}
