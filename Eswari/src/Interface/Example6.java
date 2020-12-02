package Interface;

//interface 1
interface twoWheelerVechicles
{
    //abstract methods
    public void bikeStart(String ansr);
    public void bikeSpeed(int speed);
}
//interface 2
interface threeWheelerVehicles
{
    public void autoStart(String ansr);
    public void autoSpeed(int speed);
}
//interface 3
interface fourWheelerVechicle
{
    //abstract methods
    public void carStart(String ansr);
    public void carSpeed(int speed);
}
//interface 4 extends those 3 interfaces
interface vechicles extends twoWheelerVechicles,threeWheelerVehicles,fourWheelerVechicle
{
    //abstract method
    public void display(String result);
}

//normal class
class VechiclesDetails implements vechicles
{
    //interface 1 methods implementation
    public void bikeStart(String ansr)
    {
        String result = ansr;
        if(result == "yes")
        {
            display("Bike is started");
        }
        else if(result == "no")
        {
            display("Bike is not started");
        }
    }
    public void bikeSpeed(int speed)
    {
        System.out.println("The spped of bike is " +speed);
    }

    //second interface methods implementation
    public void autoStart(String ansr)
    {
        String result = ansr;
        if(result == "yes")
        {
            display("Auto is started");
        }
        else if(result == "no")
        {
            display("Auto is not started");
        }

    }
    public void autoSpeed(int speed)
    {
        System.out.println("The speed of auto is " +speed);
    }

    //third interface methods implementation
    public void carStart(String ansr)
    {
        String result = ansr;
        if(result == "yes")
        {
            display("Car is started");
        }
        else if(result == "no")
        {
            display("Car is not started");
        }
    }
    public void carSpeed(int speed)
    {
        System.out.println("The speed of car is " +speed);
    }

    //fourth interface method implementation
    public void display(String result)
    {
        System.out.println("The result is  " +result);
    }

}

public class Example6 
{
    public static void main(String[] args) {
        VechiclesDetails vd = new  VechiclesDetails();                  //object creation for implementing class
        System.out.println("--------Two wheeler details-----------");
        vd.bikeStart("yes");                                               //methods calling
        vd.bikeSpeed(90);
        System.out.println("--------Three wheeler details-----------");
        vd.autoStart("no");                                                     //methods calling
        vd.autoSpeed(100);
        System.out.println("--------Four wheeler details-----------");
        vd.carStart("yes");                                                     //methods calling
        vd.carSpeed(120);
        


    }
    
}
