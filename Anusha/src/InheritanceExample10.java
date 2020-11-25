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
    int Items;
    Apple(int num)  //constructor for parent class
    {
        Items=num;
    }
    void getDisplay() // method for parent class
    {
        System.out.println("Number of items:"+Items);
    }
}
class Banana extends Apple // child class
{
    int numofitems; 
    Banana(int n) // constructor for child class
    {
       super(n);
       numofitems=n;
    }
    void display() //method for display
    {
            super.getDisplay();
    }
}
 