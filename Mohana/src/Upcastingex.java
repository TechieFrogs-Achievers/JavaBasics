class Vechicle
{
    public void action() //overidden method
    {
        System.out.println("vechicle class");
    }
} 
class Car extends Vechicle
{
    public void action() //overiding method 
    {
        System.out.println("car has 4 wheels");
    }
}
public class Upcastingex 
{ 
    public static void main(String[] args) 
    {
        Vechicle v = new Car(); //upcasting parent refrence with child object 
        v.action();  
        
    }
    
}
