class Parent
{
    void display()                      //method for printing
    {
        System.out.println("This is a parent class");   

    }

}

 class Child extends Parent             //child class inherits the properties of parent class
{
    void show()                                 //method for printing
    {
        System.out.println("This is child class");  
    }

 
    
}


public class InheritanceEx1 
{
    public static void main(String[] args)
  {
        Child ch = new Child();     //object creation for child class
        Parent pt = new Parent();  //object creaton for parent class
        
        pt.display();           //method calling with object of parent class from parent class
        ch.show();              //method calling with object of child class from child class
        ch.display();           //method calling with object of child class from parent class
    
    }
}
