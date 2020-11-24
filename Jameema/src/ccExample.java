public class ccExample
 {
     int x,y;
     ccExample() // constructor without parameters
     {
         this(6); //calling current constructor 
         System.out.println("default constructor");
     }
     ccExample(int c) //parameterised constructor
     {
         this(5,6); //calling current constructor with values
         x=c;
         System.out.println(c++); // printing addition of two values
     }
     ccExample(int a, int b)
     {
         x=a ; //assiging parameters to variables
         y=b;
         System.out.println(x*y); //multiplication of two values
     }
     ccExample(int a , int b , int h)
     {
         x=a;
         y=b;
         System.out.println(x-y-h);
     }
     public static void main(String[] args)
      {
          new ccExample(); //by using new keyword calling constructor
          new ccExample(9,5,6); //values passing in constructor
         
     }

    
}
