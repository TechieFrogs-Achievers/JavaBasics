package MethodsExamples;

class A //parent class
{
    static void method()//overrided method
    {
        System.out.println("parent"); 
    }
} 
class B extends A // extended class
{
   static void method()//overriding method
   {
       System.out.println("child ");
   }
} 
public class Example8 
{
    public static void main(String[] args) 
    {
        A.method(); //staic methods call directly by using of class name 
        B.method();
        //A obj = new B();
       // obj.method(); we cant call static method by using object        
    }
    
}
