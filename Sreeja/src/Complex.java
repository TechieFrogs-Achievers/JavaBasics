import java.util.Scanner;

public class Complex
 {
     public void sum(float r1,float i1,float r2,float i2)  //creating a method for sum
     {
        float real = r1+r2;
        float imaginary = i1+i2;
        System.out.println(real+" "+"+"+" "+imaginary+"i");


     }
     public void diff(float r1,float i1,float r2,float i2)  // creating a method for difference
     {
        float real = r1-r2;
        float imaginary = i1-i2;
        System.out.println(real+" "+"+"+" "+imaginary+"i");

     }
     public static void main(String[] args)
      {
         Scanner sc = new Scanner(System.in);  
         float r1 = sc.nextFloat();
         float r2 = sc.nextFloat();
         float i1 = sc.nextFloat();
         float i2 = sc.nextFloat();
         
         sc.close();
         
         Complex S = new Complex();    //object creation for class
           S.sum(r1,i1,r2,i2);      // calling sum method
           S.diff(r1,i1,r2,i2);    // calling diff method
        }
     
    
}
