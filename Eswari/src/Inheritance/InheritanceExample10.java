package Inheritance;

//super class
class Banana
{
    int number_of_items;
    Banana(int n)
    {
        number_of_items = n;
    }
    public void show()
    {
        System.out.println("The count of items are " +number_of_items);
    }
}

//sub class
class Apple extends Banana
{
    int number_of_items;
    //Constructor
    Apple(int n)
    {
        super(n);
        number_of_items = n;
    }
    @Override
    public void show() {
        // TODO Auto-generated method stub
        super.show();
    }
    // public void show()
    // {
    //     System.out.println("The count of items are  " +number_of_items);
    // }
}
public class InheritanceExample10 {
    public static void main(String[] args) {
        Banana b = new Banana(6);               //object creation for super class
        b.show();                               //super class method called by super class object
        Apple a = new Apple(5);                 //object creation for child class
        a.show();                                //child class method called by child class object
    }
    
}
