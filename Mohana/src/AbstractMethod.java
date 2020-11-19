abstract class Rbi
{
    //abstract method creation

    abstract void intrest(); // no implementation only declaration is there
    
}
class Sbi extends Rbi
{
    void intrest() // abstract method implementation
    {
        System.out.println( " intrest of sbi is = 1 rupee");
    }

}

public class AbstractMethod 
{ 
    public static void main(String[] args)
    {
        Rbi rb; // we can't create object to the abstarct class but we can create refernce
         rb = new Sbi();
         rb.intrest();
        
    }

    
}
