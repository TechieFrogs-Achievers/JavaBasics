class Employees
{
    protected void show()       //overridden method
    {
        System.out.println("Iam an employee");
    }
}

class Teacher1 extends Employees  //overriding method
{
    public void show()
    {
       //this invokes the show method of super class
       
        super.show();
        System.out.println("Iam a Teacher");
    }
}

class MathsTeacher extends Teacher1
{
    public void show()
    {
        //this invokes the show method of Teacher1 class

        super.show();
        System.out.println("Iam a Maths teacher");
    }
}



public class SuperEx
 {
    public static void main(String[] args)
     {
      
        //object creation for derived class

        MathsTeacher ms = new MathsTeacher();

        ms.show();  //method calling
   } 
}
