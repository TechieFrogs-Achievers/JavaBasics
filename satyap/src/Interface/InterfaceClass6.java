package Interface;// package

interface Employee // interface1
{
    void salary(); // methods in interface1
    void department();
}
interface Student  // interface2
{
    void marks(); //methods in interface2
    void attendance();
}
interface Driver // interface3
{
    void display(); // methods in interface3
    void show();
}
interface Teacher extends Employee,Student,Driver // another interface implementing first 3 interfaces
{
    void staff(); // methods in new interface
}
class Student1 implements Teacher // class implementing new interface
{
   public void staff() // method implementation for all the methods
    {
        System.out.println("Department:");
    }
    public void salary()
    {
        System.out.println("Salary:");
    } 
    public void department()
    {
        System.out.println("Department:");
    }
    public void marks()
    {
        System.out.println("Marks:");
    }
    public void attendance()
    {
        System.out.println("attendance:");
    }
    public void display()
    {
        System.out.println("Display method");
    }  
    public void show()
    {
        System.out.println("show method");
    }
}
public class InterfaceClass6 // driver class
{
    public static void main(String[] args) {
     Student1 s1=new Student1(); //obj creation 
     s1.attendance();// method call for attendance
     s1.department(); // method call for department
     s1.display();// method call for display
     s1.show();//method call for show
     s1.marks();//method call for marks
     s1.salary();//method call for salary
     s1.staff();   //method call for staff
    }
}
