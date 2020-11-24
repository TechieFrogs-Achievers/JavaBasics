class Banana
{
    int no_of_items; //assigning integer member variable
    Banana(int items) // containig the constructor member
    {
        no_of_items = items;
    }
    public void show() //creating the member method
    {
        System.out.println("no_of_items in Banana:" +no_of_items);
    }
}
class Apple extends Banana  //childclass apple inherits the parentclassbanana
{
    int no_of_items;
    Apple(int items)
    {
        super(items); //super to call immediate class 
        no_of_items = items;
    }
    public void show()
    {
        System.out.println("no_of_items in Apple:" +no_of_items);
    }
}
public class Fruits10 
{
public static void main(String[] args)
 {
    Apple a = new Apple(30); //creating object for childclass Apple & assign the value
    a.show();
    Banana b = new Banana(25);
    b.show();
}

}
