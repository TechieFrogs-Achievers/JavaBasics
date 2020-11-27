//overring is not possible for data members
class Bike
{
    int speedLimit = 100;

}
//sub class for over riding data member
class Car extends Bike
{
    int speedLimit = 150;
    
    
}
public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Bike b = new Car();                     //creating object for child class through parent class
        // Car c = new Car();
        // System.out.println("Speed limit is " + c.speedLimit);
        System.out.println("The speed Limit is " + b.speedLimit);
    }
}
