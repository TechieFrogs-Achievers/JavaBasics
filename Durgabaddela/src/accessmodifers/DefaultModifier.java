package accessmodifers;//package
class Modifiers
{
    void display()
    {
        System.out.println("Hey there! im in default method");
    }

}
//package abc;
public class DefaultModifier 
{
    public static void main(String[] args)
    {
        //creating  object for instance 
         
        Modifiers d = new Modifiers();
        d.display();//method call
    }
    
}
