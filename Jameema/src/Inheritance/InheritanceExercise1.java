package Inheritance;

class ParentClass // parent class
{
    public void ParentMethod() //parentclass method
    {
        System.out.println("This is Parent class");
    }

}
class ChildClass extends ParentClass //child class aquires the parentclass details by using extends keyword
{
    public void ChlidMethod() //child class method
    {
        System.out.println("This is Child class");
    }

}
public class InheritanceExercise1
 {
     public static void main(String[] args)
      {
          ParentClass p = new ParentClass(); //creating object to parent class
          ChildClass c = new ChildClass(); //creating object to child cladd
          p.ParentMethod(); //calling parentmethod by using parent class object
          c.ChlidMethod(); //calling childmethod by using childclass object
          c.ParentMethod(); //calling parentmethod by using child class object
         
     }

    
}
