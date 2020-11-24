import accessmodifiers.*;

public class Student
 {
     //class or instance variables
    String name="John";
    int roll_no=2;

    public static void main(String[] rd)
     {
        //object creation for the class student
         Student object=new Student();

        // object.name='John';
        // object.roll_no=2;
        
         System.out.println(object.name);
         System.out.println(object.roll_no);

         //calling private members from oter package
        // System.out.println(Modifier.i);

        //calling another class from other package(defaultmodifier)
       // System.out.println(ModifierTwo.add());
     }
    
}  

 
