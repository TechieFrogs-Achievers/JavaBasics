package polymorphism;

//PARENT CLASS
//final 
class Vehicle
{
    //over-ridden method
   //protected(child class should not contain week modifier )
   //final methods can not be overriden by child class
    void move()
    {
    
        System.out.println("vehicle is moving");
    }
}

//subclass one
class Bullakcart extends Vehicle
{
   // super.move();
    //overriding method
   void move()
    {
        int i=10;
        System.out.println("bullakcark  is moving with low speed");
    }
}

//subclass two
class Scooter extends Vehicle
{
    //overriding method
    void move()
    {
        System.out.println("scooter  is moving with medium speed");
    }
}

//subclass three
class Car extends Vehicle
{
    //overriding method
    void move()
    {
        System.out.println("car  is moving with  high speed");
    }
    //specialized method
    void bus()
    {
        System.out.println("bus  is moving with very high speed");
    }

}

class Allow
{
    void access(Vehicle v)
    {
       v.move();
    }
}

//main class
public class PolymorphismOne 
{

    public static void main(String[] hv)
    {
        //parent reference
        Vehicle v=new Vehicle();
     
    /* //parent reference to subclass bullakcart
        v=new Bullakcart();
        v.move();
        ////parent reference to subclass Scooter
        v=new Scooter();
        v.move();
        //parent reference to subclass car
        v=new Car();
        v.move();   */
        


     /*   Bullakcart b=new Bullakcart();
        Scooter s=new Scooter();
        Car c=new Car();
        Allow a=new Allow();
        a.access(b);
        a.access(s);
        a.access(c);  */

       
        ((Car)(v)).bus();  //DOWNCASTING
     }
    
}
