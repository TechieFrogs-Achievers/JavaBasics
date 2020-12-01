package AbstractionExamples;
abstract class  Vechile
{
     protected String name ;//variable 
    abstract void speed();  //abstract method

    void  wheels()//non abstract method
    {
        System.out.println("vechicle has any number of wheels");
    }

} 
class Car extends Vechile
{
    void speed()//implementation of abstract method
    {
        System.out.println("car moves faster");
    }  

    void wheels() //overriding method
    {
        System.out.println("car has 4 wheels");
    }
}
public class Example1 
{
     public static void main(String[] args) 
     {
         Vechile cc = new Car(); //object creation 
        System.out.println( cc.name = "Honda");
         cc.speed(); //method call 
         cc.wheels();//method call
         
     }
}
