package Interface;
interface apple  // interface class 
{
    public void show(); //methods for interface
    public void display();
    public void pack();
}

public class Interface3   implements apple  // class implemts the interface
{

//public class Interface3pack {
    public void show()
    {
        System.out.println("this is a pack");
    }
   // @overloading
    public void display()
    {
        System.out.println("this is sub pack");
    }
   // @overloading
    public void pack()
    {
        System.out.println("this is last pack");
    }  
    public static void main(String[] args) {
        Interface3 i=new Interface3(); // object created for class 
        i.show(); //calling the method from class object
        i.display();
        i.pack();
    }

}



