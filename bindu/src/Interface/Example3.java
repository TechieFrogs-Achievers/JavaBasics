package Interface;

interface Presentation {
    //creating the methods 
    public void sample();
    public void input();
    public void display();
}
 public class Example3 implements Presentation    //subclass implements the parentclass
{
    public void sample()   //calling the method
    {
        System.out.println("this a sample example:"); //displays the result
    }
    public void input()
    {
        System.out.println("this is input for sample:");
    }
    public void display()
    {
        System.out.println("this will display the final output:");
    }
    public static void main(String[] args) {
        Presentation e = new Example3();   //creating object for the class(upcasting)
        e.sample();
        e.input();
        e.display(); //calling the method 
    }

}
