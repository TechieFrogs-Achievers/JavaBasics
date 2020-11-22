class Employee
{
  String name,address;
  int year,salary;
   //create a method to dispaly the details of an employee
   public void display(String n,String ads,int y,int s)
   {
       name=n;address=ads;year=y;salary=s;
      System.out.print(n+" \t "+y+" \t\t "+ads+" \t "+s+"\n");
   }
}
public class EmployeeDetails 
{
    public static void main(String[] args) 
    {
        System.out.print("Name"+"\t"+"Year of Passing"+"\t\t"+"Address"+"\t\t"+"Salary"+"\n");
        Employee e=new Employee();//create object for Employee class
        e.display("Robort", "64C- WallsStreat",1994,30000);//calling method
        Employee e1=new Employee();//create object for Employee class
        e1.display("Sam", "68D- WallsStreat",2000,30000);//calling method
        Employee e2=new Employee();//create object for Employee class
        e2.display("Jhon", "26B- WallsStreat",1999,30000);//calling method
    }
}
