package Interface; // Package

interface pack //interface
{
    void display(); //method for interface
}
public class InterfaceClass7 implements pack // class implementing interface
{
  public void display() // method for class
   {
       System.out.println("Display method");
   }
   public static void main(String[] args) {
       InterfaceClass7 i7=new InterfaceClass7(); //obj creation
       i7.display();// method call for display 
   }
} 
