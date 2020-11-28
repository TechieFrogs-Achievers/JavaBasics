//abstract class

abstract class Parent2
{
    abstract void message();        //abstract method
}

class Father extends Parent2
{
    void message()          //implementation of abstract method
    {
        System.out.println("This is first subclass");
    }
}

class Mother extends Parent2
{
    void message()          //implementation of abstract method
    {
        System.out.println("This is second subclass");
    }
}

public class Abstract1 
{
     public static void main(String[] args) 
     {
        Parent2 pf = new Father();               //object creation for father class
        
        pf.message();                   //method calling

        Parent2 pm = new Mother();           //object creation for mother class

        pm.message();                   //method calling
    }
}
