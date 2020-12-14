package ExceptionsExercise;

import java.io.IOException;

//java program to handle the exceptions with overloaded methods
class Building
{
    public void color() throws IOException                  //method for building class
    {
        System.out.println("The color of building is Blue");
    }
}
//child class extends base class
class Room extends Building
{
    public void color() throws IOException              //overloaded method
    {
        System.out.println("The color of room is White");
    }
}

public class Example8 
{
    public static void main(String args[])
    {
        Building b = new Room();                //object creation for child class using upcasting
        try{                    //try block for calling method
            b.color();
        }
        //catch block for hndling try block exception
        catch(Exception e)
        {
            System.out.println("The exception is : " +e);
        }
    }
    
}
