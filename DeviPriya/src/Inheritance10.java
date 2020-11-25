class Banana
{
    int no_of_items; //instance variable
    Banana(int items) //patrameterised comstructtor
    {
        no_of_items=items;
    }
    public void Show() //method 
    {
        System.out.println("no of items in banana  :" + no_of_items); //print the no of items in banana

    }
}
class Apple extends Banana //inherits superclass details
{
    int no_of_items;
    Apple(int items) //parameterised constructor
    {
        super(items); //calling super class constructor
        no_of_items=items;

    }
    public void Show()
    {
        System.out.println("no of items in apple  :" + no_of_items); //print the no of items in Apple
    }

} 
public class Inheritance10
{
    public static void main(String[] args)
     {
         Apple a = new Apple(4); //creating objects for Apple
         a.Show();
         Banana b = new Banana(3); //creating objects for Banana
         b.Show();

    }

}
