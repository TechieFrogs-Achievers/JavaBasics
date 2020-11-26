public class MethodOverloadingExample 
{
    public static void main(String[] args)
    {
      Examplex e1=new Examplex();//object create for examplex class
      e1.sumOfTwo(2.5f, 3.6f); //assign values 
      e1.sumOfThree(2.5f, 3.6f, 6.6f);
      Example2.diffrence(2.5f, 24.25d);//assign values for static method by using class name
      Example2.diffrence1(25.25d, 2.0f);

    }
}
//example of method overloading same method name and same datatype but differ in no of parameters
class Examplex
{   
    public void sumOfTwo(float f1,float f2)//addition of two float values
    {
        System.out.println("Sum of two numbers="+(f1+f2));
    }
    public void sumOfThree(float f1,float f2,float f3)//addition of three float values
    {
        System.out.println("Sum of three numbers="+(f1+f2+f3)); 
    }
}
//example of method overloading same method name and diffrent datatype and different  no of parameters
class Example2
{
    static void diffrence(float f1,double d1)//diffrence in float and double value
    {
        System.out.println("Difference of two numbers="+(f1-d1));
    }
    static void diffrence1(double d1,float f1)//diffrence in float and double value
    {
        System.out.println("Difference of two numbers="+(d1-f1));
    }
}