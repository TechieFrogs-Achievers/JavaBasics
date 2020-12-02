package Interface;

interface Fastfood {
    //creating the methods

    public void spicy();
    public void Sweetcorn();
    public void chickenPopcorn();
}
public class Sandwitch5 implements Fastfood    //subclass implements the parentclass
{
    public void spicy()   //calling the methods
    {
        System.out.println("this are spicy items:");
    } 
    public void Sweetcorn()
    {
        System.out.println("this belongs to sweet items:");  //displays the sweetcorn method
    }
    public void chickenPopcorn()
    {
        System.out.println("this items are from nonveg:");
    }
    public static void main(String[] args) 
    {
        Fastfood s= new Sandwitch5();   //creating the object for parentclass(upcating)
        s.spicy();
        s.Sweetcorn();
        s.chickenPopcorn();  //calling the object
    }

}
