public class InheritanceExample10 
{
    public static void main(String[] args)
     {
        Banana b=new  Banana(6); // object calling for child class
        b.getDisplay(); // method calling for child class
        Apple a=new Apple(3); // obj calling for parent class
        a.getDisplay(); // method calling for parent class
       
    }
}
class Apple
{
    int number_of_items;
    Apple(int num)  //constructor for parent class
    {
        number_of_items=num;
    }
    void getDisplay() // method for parent class
    {
        System.out.println("Number of items:"+number_of_items);
    }
}
class Banana extends Apple // child class
{
    int number_of_items; 
    Banana(int n) // constructor for child class
    {
       super(n);
       number_of_items=n;
    }
    void display() //method for display
    {
            super.getDisplay();
    }
}
 