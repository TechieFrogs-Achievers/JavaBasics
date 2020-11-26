class Superclass
{   
    int i;
    // creating method
    void printNum(int i)
    {
        System.out.println("The value of i is :" +i);// print i value
    }
    
}
class Subclass  extends Superclass
{   
    int j;
    // creating method
    void printNum( int j)
    {
        System.out.println("The value of j is :" +j);// print j value
    }
}
public class Method7
{
    public static void main(String[] args)
    {   
        // creating object for subclass
        Subclass c = new Subclass();
        //calling two methods with subclass object
        c.printNum(3);
        c.printNum(6);
        
    }
}
