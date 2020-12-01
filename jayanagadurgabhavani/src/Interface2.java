interface Printble
{
    void print();
}
interface Showable
{
    void show();
}
class Jay implements Printble,Showable
{
    public void print()
    {
        System.out.println("Hellow");
    }
    public void show()
    {
        System.out.println("java");
    }
}
public class Interface2
{
    public static void main(String[] args)
     {
        Jay j=new Jay();
        j.print();
        j.show();
    }
}