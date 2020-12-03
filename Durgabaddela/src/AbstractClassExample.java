//abstract parent class
abstract class Animal
{
    //abstract method

    public abstract void sound();
 }
 /*class  Bike
{
    //abstract method

    public abstract void sound();//class should be abstract
 }
 */
/* abstract class car
{
    

    public  void sound();//method body should be there instead of semicoloum
 }
 */
 //Dog class extends Animal class

class Dog extends Animal
{
    public void sound()//override method
    {
     System.out.println("Woof");
    }
}
    public  class AbstractClassExample
    {
    public static void main(String args[])
    {
     Animal obj = new Dog();
     obj.sound();
    }
}

 
 