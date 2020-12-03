package InterfaceExercise;
// interface class
interface classes
{
    void demo();//abstract method
}
public class InterfaceProgram8//outer class
{
    public class Innerclass implements classes// inner class implements from classes
    {
       public void demo()
        {
            System.out.println("Outerclasses & inner classes");
        }

    }
    public static void main(String[] args)
    {
        InterfaceProgram8 i = new InterfaceProgram8();// creating object for outer class
        InterfaceProgram8.Innerclass obj = i.new Innerclass();// creating object for inner class 
        obj.demo();// calling method with inner class object
    
        
    }
    
}
