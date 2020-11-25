package InheritanceDoc;

class Banana //parent class
{
    public int noOfItems; 

    public Banana(int nitem)//constructor having 1 parameter
    {
       noOfItems = nitem; 
    }  
       public void show() //method to show no of items
       {
            System.out.println("No of items " +noOfItems);
       }
    
} 
class Apple extends Banana //inherits the parent class properties
{
    public int no_ofItems;
    Apple( int nitem, int items)//constructor having 2 params
    {
        super(nitem); this.no_ofItems = items; //calling super class constructor
    } 
    public void show() //overridden method of parent class
    {
        System.out.println("No of Apples : "+noOfItems + "\n"+ "No of bananas : " +no_ofItems);
    }
}

public class Program10 
{ 
    public static void main(String[] args) 
    {

    Apple ap = new Apple( 10, 20); 
    ap.show();
    }
}
