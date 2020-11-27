 
 class Demo
{ 
    //method to add two intergs

    public void show(int c,int ch)
    {
        System.out.println(c+ch);
    }

    //override method to concatinate two strings

    public void show(String c, String ch)
    {
        System.out.println(c+ch);
    }
    public void show(int c, String ch)
    {
        System.out.println(c+ch);
    }
    public void show(char c, String ch)
    {
        System.out.println(c+ch);
    }
    public void show(byte c, int ch)
    {
        System.out.println(c+ch);
    }
    public void show(char c, char ch)
    {
        System.out.println(c+ch);
    }
    public void show(float c, float ch)
    {
        System.out.println(c+ch);
    }
}
public class OperatorOverloading
{
     public static void main(String[] args) 
     {
        Demo d = new Demo();
        {
            
            d.show(43, 654);
            d.show("Hello", "java");
            d.show(45, "Hi");
            d.show('d',"efgh");
            d.show(23,116);
            d.show('d', 'b');
           // d.show(2.4, 1.3);
        }
    }
}
