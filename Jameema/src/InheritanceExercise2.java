class ParentClass1 //parent class
{
    private void ParentMethod() //parentclass method as private
    {
        System.out.println("This is Parent class");
    }

}
class ChildClass1 extends ParentClass1 //child class aquires the parentclass details by using extends keyword
{
    public void ChlidMethod() //child class method
    {
        System.out.println("This is Child class");
    }

}
public class InheritanceExercise2
 {
     public static void main(String[] args)
      {
        ParentClass1 p = new ParentClass1();
        ChildClass1 c = new ChildClass1();
        // p.ParentMethod(); //here parentmethod is private so the scope is within the class
        c.ChlidMethod();
        //c.ParentMethod(); //here parentmethod is private so the scope is within the class it couldnt access the details 

         
     }
    
}
