class Apple
{
    int numOfItems;// datamember
    Apple(int num)  //constructor for parent class
    {
        numOfItems=num;
    }
    void getDisplay() // method for parent class
    {
        System.out.println("Number of items:"+numOfItems);
    }
}
class Banana extends Apple // child class
{
    int num_of_items; // datamember
    Banana(int n) // constructor for child class
    {
       super(n);
       num_of_items=n;
    }
    void display() // method for child class usins super for method for parent class
    {
        //System.out.println("Number of items:"+numOfItems);
        super.getDisplay();
    }
}
class Inheritance10
{
    public static void main(String[] args) {
        Banana b=new  Banana(6); // obj calling for child class
        b.getDisplay(); // method calling for child class
        Apple a=new Apple(3); // obj calling for parent class
        a.getDisplay(); // method calling for parent class
       // b.display();
    }
}
