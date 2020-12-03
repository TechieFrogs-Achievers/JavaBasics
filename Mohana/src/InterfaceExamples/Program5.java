package InterfaceExamples;

interface FastFood
{
    void type();
    float cost(float c);
} 

class Sandwich implements FastFood
{
    public void type()
    {
        System.out.println("sandwich");
    }

    public float cost(float c)
    {
          return c;
    }
}
public class Program5 
{
    public static void main(String[] args) 
    {
        Sandwich sc = new Sandwich();
        sc.type();
        System.out.println("cost of sandwich is : " +sc.cost(299));
        
    }
    
}
