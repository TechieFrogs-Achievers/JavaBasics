public class ProtectedExample
 {
    protected static String name = "seetha";
    
    protected void display()
    {
        System.out.println(" Iam female");
    }
     public static void main(String[] args)
      {
        ProtectedExample pr = new ProtectedExample();
        System.out.println("name:"+name);
        pr.display();
    }
}
