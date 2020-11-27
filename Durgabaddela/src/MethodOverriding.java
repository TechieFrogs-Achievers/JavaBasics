//parent class

class Vehicle
{
    void move()
    {
        System.out.println("vehicle is moving");
    }
}
//child class 
class Bullakcart extends Vehicle
{
    void move()//override method
    {
        System.out.println("bullakcart is moiving  with low speed");
    }
}
//child class extends parent class

class  Bike extends Vehicle
{
    void move()//override  method
    {
        System.out.println("bike is moiving with medium speed");
    }
}

//child class extends extends parent class

class Car extends Vehicle
{
    void move()//override method
    {
        System.out.println("car is moving with high speed");
    }
}
public class MethodOverriding 
{
    public static void main(String[] args)
    {
    //object creation for parent class

    Vehicle v = new Vehicle();

    //object creation for child class with parent ref

    v = new Bullakcart();
    v.move();//method call with parent ref

    //object creation for child class with parent ref

    v = new Bike();
    v.move();//method call with parent ref

    //object creation for child class with parent ref

    v= new Car();
    v.move();//method call with parent ref
    }

}
