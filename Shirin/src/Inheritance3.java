// class name as member
class Member 
{
    String name;
    int Age;
    long Phnno;
    String Address;
    int salary;
    void PrintSalary() // creating method for print salary
    {
        
        System.out.println(salary);

    }
}
   // class employees 
    class Employees extends Member 
    {
        String Specialization; 
        
    }
    // class manager
    class Manager extends Member
    { 
        String department;

    }
    public class Inheritance3
    {
        public static void main(String[] args)
        {
            
            Manager m = new Manager(); // creating object for member class
            // assigning  data for manager
            m.name = "abcd";
            m.Age  =  35;
            m.Phnno = 876549865;
            m.Address = "rjy";
            m.salary = 55000;
            m.department = "HR";
            System.out.println(m.name + " " +m.Age+" "+m.Phnno+" " +m.Address+" "+m. salary+ " "+m.department);// print manager details
            //assigning data for employee 
            Employees e = new Employees();// creating object for employee
            e.name = "xyz";
            e.Age  = 31;
            e.Phnno = 769376278;
            e.Address = "rjy";
            e.salary = 35000;
            e.Specialization = " abcde";
            System.out.println(e.name + " " +e.Age+" "+e.Phnno+" " +e.Address+" "+e. salary+" "+e.Specialization);// print employee details
        }
        

        



    }


    
 
    
