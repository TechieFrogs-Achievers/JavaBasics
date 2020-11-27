abstract class Animal // abstract class 
{
    abstract void cats(); //here we declare two abstract methods 
    abstract void dogs();
}
class Cat1 extends Animal  //parent class inherits abstract class 
{
    void cats() //method for parent class 
    {
        System.out.println("cats bark meow");
    }
}
class Dog1 extends Animal //child class inherits abstract class 
{
    void dogs() // method for child 
    {
        System.out.println("dogs bark bow");
    }
}
public class AbstractclassAnimal
{
     public static void main(String[] args) 
    {
    Animal a=new Cat1(); // object forparent class refernce to child class upcasting
    Animal a1=new Dog1(); //object forparent class refernce to child class upcasting
    a.cats(); //calling  a method with parent object 
    a1.dogs();//calling  a method with parent object 
 }
}