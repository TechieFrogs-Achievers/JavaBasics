package Interface;



//interface creation
interface interfaceExample4
{
    //data members creation
    static int age = 22;
    final String name =  "eswari";
}

public class Example4 
{
    public static void main(String[] args) {
        String name = "rama";                                       //local data member
        //calling interface data members
        System.out.println("Age is " +interfaceExample4.age);
        System.out.println("Name is " +interfaceExample4.name);                
        System.out.println("Name is " +name);                       //local data member is printing
        //by using implementing interface
        // System.out.println("Age is " +age);
        // System.out.println("Name is " +name); 
        
    }
    
}
