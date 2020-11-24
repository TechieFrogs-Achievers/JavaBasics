public class Protected 
{
    protected void display()
    {
      System.out.println("welcome");   
    }
}
public class Example
{
    public static void main(String[] args)
    {
       Protected obj = new Protected();
       obj.display();
    }
}




