package inheritence;
//parent class
class Apple
{
    int number_of_items=52;
}

//child class
class Banana extends Apple
{

int number_of_items;
//child class constructor
public Banana(int noOfItems)
{
    number_of_items=noOfItems;
}
//child class method to display no on items
void  show()
{
    System.out.println(super.number_of_items);
    System.out.println(this.number_of_items);
}

}


public class Program10
{
    public static void main(String[] tf)
    {
     //super class object
     /* Apple app=new Apple();
      app.number_of_items=52;*/
      //child class object
      Banana ban=new Banana(54);
      ban.show();
    
    }
    
}
