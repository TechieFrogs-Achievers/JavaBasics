package package1;
import Package.*;    // importing all classes in package package
public class C extends A // Class c is subclass of A 

{
public static void main(String args[]) 
{ 
    C obj = new C(); 
    obj.display(); 
    //A1 a1 = new A1();  // it displays error because A1 consists of private method
    //a1.display();      //we can not use private methods with in and without packages also

} 

    
}
