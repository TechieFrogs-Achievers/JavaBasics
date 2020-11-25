class Banana 
{
    int number_of_items;
    // constructor
    Banana(int i)
    {
        number_of_items = i;

    }
    // create method for bannana
    void show()
    {
        System.out.println("The no.of bannans are :" + number_of_items);//print items
    }   
}
// child class inherit from the parent class
class Apple extends Banana
{
    int number_of_items;
    Apple( int j)
    {
        super(j);//immediate class
        number_of_items = j;

    }
    void show()
    {
        System.out.println("The no.of apples are : " + number_of_items);
    }
}
public class Inheritance10
{
    public static void main(String[] args) 
    {
        Banana b = new Banana(6);// creating object
        b.show();//calling method
        Apple a = new Apple(16);
        a.show();


        
    }
}
