interface Fastfoods //interface class
{
    void frenchfries(); // non-abstract methods 
    void coke();
}
class Sandwich implements Fastfoods //parent class implemts the interface class 
{
   public  void frenchfries() //method for parent class 
    {
        System.out.println("buyed frenchfries:");
    }
    public void coke()
    {
        System.out.println("thumbsup coke");
    }
}
class InterfaceSandwitch //child class implmts the interface
{
    public static void main(String[] args) 
    {
        Sandwich s=new Sandwich(); // object for parent class
        s.coke(); //calling method with parent object
        s.frenchfries();
    }
}
    