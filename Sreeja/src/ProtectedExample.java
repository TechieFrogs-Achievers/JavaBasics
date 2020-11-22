public class ProtectedExample
 {
    protected static String name = "seetha"; //protected modifier
    
    protected void display()  //using protected modifier for display method 
    {
        System.out.println(" Iam female");
    }
     public static void main(String[] args)
      {
        ProtectedExample pr = new ProtectedExample(); //creating object for class
        
        System.out.println("name:"+name);    
        
        pr.display(); //method calling
    }
}
