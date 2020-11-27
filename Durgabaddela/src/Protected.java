public class Protected 
{
    protected void display()
    {
      System.out.println("welcome");   
    }
}
 class Example
{
    public static void main(String[] args)
    {
       Protected obj = new Protected();
       obj.display();
    }
}




