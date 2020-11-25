package InheritenceExcercises;
class Parent1 //creating parent class
{ 
   private void display()
   {
       System.out.println("This is parent class");
   }
}
    //creating chaild class inherites the parent class
 class SubClass2 extends Parent
{
    void display1()
    {
        System.out.println("This is child class");
    }
}
public class Inheritence2
{

    public static void main(String[] args)
    {
    // creating object for parent class

    //Parent p = new Parent();
    //p.display();//method call in parent class

    // creating object for child class

    SubClass s = new SubClass();
    //s.display1();//method call in child class

    //throws an error not visible parent class
     //s.display();

     //method in parent class call by using child class object

     s.display1();

    }
 
}


    

