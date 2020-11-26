package MethodsExamples;

class Maths 
{
    public void area(int length ,int breadth)//method to display area having 2 paramters
    {
        System.out.println("area of rectangle is : "+ (length*breadth));
    } 
   public void area( int side ) //overloaded method  having one parameter 
   {
       System.out.println("area of rectangle is : "+(side*side));
   }
}


public class Example3 
{
    public static void main(String[] args) 
    {
        Maths mt = new Maths();//object creation for maths class
        mt.area(4, 5); //calling 2 parameters method
        mt.area(5); //calling one parameter method
        
    }
    
}
