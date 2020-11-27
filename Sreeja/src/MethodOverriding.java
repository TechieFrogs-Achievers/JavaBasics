class Human
{
    //overridden method
    
    void eat()
    {
        System.out.println(" Human is eating");
    }
}
class Boy extends Human
{
   //overriding method
   
    void eat()
    {
        System.out.println("Boy is eating");
    }
}

class Girl extends Human
{
   //overriding method
   
    void eat()
    {
        System.out.println("Girl is eating");
    }
}


public class MethodOverriding 
{
     public static void main(String[] args) 
    {
        //object creation for child classes
      
        Girl g = new Girl();     

        Boy b = new Boy();

        //this will calls the child class methods 

       b.eat();
       g.eat();
   } 
}
