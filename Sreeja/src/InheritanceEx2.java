 class Parent1
{
    
    public Parent1()
    {
        System.out.println("thi is sub class");
    }
    
    
    private void show()        //creating  method in parent class
    {
        System.out.println("This is a parent class");
    }
}
class child1 extends Parent1        
 {
    public void display()                   //creating a method in child class
    {
        System.out.println("This is a child class");
    }

    public child1()
    {
        System.out.println("THis is derived class");
    }
    
}

public class InheritanceEx2
{

 public static void main(String[] args)
  {
      //  Parent1 pt = new Parent1();               
     
      child1 ch = new child1();        //object creation for child class
       
      // pt.show();        //show method is not visible to access
        ch.display();       //method calling
    
    
    }
    
}
