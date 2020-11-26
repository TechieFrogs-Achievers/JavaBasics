class Banana  //parent class
{
    int number_of_items; //data members
    Banana(int i) // constructor  for parent class
    {
        number_of_items=i; //data members
    }
    void show() //method for parent class
    {
        System.out.println("the count of item are:"+number_of_items);
    }
}
class Apple1 extends Banana //child class getting the properties from  parent class
{
    int number_of_items; //data members
    Apple1(int n)  // constructor for child class
{
    super(n); // super method inherit parent class
    number_of_items=n; 
}
//overidden
void show() // method for child class
{
    super.show(); 
}
    //System.out.println(n);
}
class Apple
{
    public static void main(String[] args) 
    {
        Apple1 a=new Apple1(5); //object created for child class 
        a.show();  //calling the method with object from child class
        Banana b= new Banana(4); // object created for parent class
        b.show();  //calling the method with object from parent class
    }
}


