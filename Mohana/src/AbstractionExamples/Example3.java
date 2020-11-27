package AbstractionExamples;
class Demo
{
    int value ;
    void dispaly() //method to display
    {
        System.out.println(" method in  Demo class");
    }
}
public  abstract class Example3  //abstract class
{
    public static void main(String[] args) 
    { 
        //obj creation
        Demo d = new Demo();
        d.value = 200;
        
        System.out.println("Main method in abstract class");
        System.out.println("value = " +d.value);
        d.dispaly();
        
    }
    
}
