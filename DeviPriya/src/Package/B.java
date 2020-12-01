package Package;

public class B {
    
    
 void display() 
    { 
        System.out.println("Devi"); 
    } 
    public static void main(String args[]) 

    {
       A a = new A();
       a.display();
       B b = new B();
       b.display();
       //A1 a1 = new A1();             // Trying to access private method of another class
       //a1.display();      //we can not use private methods with in and without packages also

    }
} 


