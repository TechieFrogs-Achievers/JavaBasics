package Interface; // interface package
interface Simple // interface 
{
    static int a=10; //datamembers
    final float b=12;
}
public class IntefaceClass4 implements Simple // class implementing interface
{
    public static void main(String[] args)
    {
        System.out.println(a); // implementation of datamembers
        System.out.println(b);
        
    }
}
