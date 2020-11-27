class Overload
{
     void display(int a)        //method to print integer value
    {
        System.out.println(a);
    }

    void display(int a,int b)       //same method with two parameters 
    {
        System.out.println(a+" "+b);
    }

    void display(float a)       //same method with float value as an argument
    {
        System.out.println(a);
    }

    void display(float a, int b)    //same method with float value and integer value as an arguments
    {
        System.out.println(a+" "+b);
    }
}

public class PolymorphismCtEx
 {
    
     public static void main(String[] args)
      {
        Overload ov = new Overload();   //creating object for Overload class


        //initializing method with different parameters
        //method calling with object

         ov.display(5);
        ov.display(5,7);
        ov.display(5.5f,8);
        ov.display(42,9);
    
    }
    
    
}
