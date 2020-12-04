package AbstractExercises;
import InterfaceExercise.InterfaceProgram3;//importing interfaceProgram3 details

abstract class ParentPack
{
    abstract void display();// method
    //abstract void display1();
}
// subclass 
  class ChildPack extends ParentPack
 {
     void  display ()
     {
         System.out.println("This is Abstarct package");
     }
    /* void display1()
     {
         System.out.println("... sub class pack..");
     }*/

 } 

public class AbstractPackage 
{
    public static void main(String[] args) 
    {
        ParentPack c = new ChildPack();// creating object for abstarct  subclass
        c.display();// calling method
       // c.display1();
       InterfaceProgram3 i = new InterfaceProgram3();// creating object for  importing class
       //InterfaceExercise.InterfaceProgram3 i = new InterfaceExercise.InterfaceProgram3();
       i.demo();
       i.demo1();
       i.demo2();
        
    }
    
}
