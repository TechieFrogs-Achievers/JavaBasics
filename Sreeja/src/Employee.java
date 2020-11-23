public class Employee
 {
    String name;
    int yearOfJoining;          //defining data members
    String address;
    int salary;


    public void employeeDetails(String x,int y,String z,int k) //method foemployee details
    {
        name = x;
        yearOfJoining = y;
        address = z;
        salary = k;
        
        System.out.println(name+" "+yearOfJoining+" "+address+" "+salary);
    }

    public static void main(String[] args)
     {
        Employee Emp1 = new Employee();
        Employee Emp2 = new Employee();     //creating objects for employees
        Employee Emp3 = new Employee();

        System.out.println("Name"+"   "+" Year of joining"+"   "+"address"+"   "+"salary");
            Emp1.employeeDetails("Robert  ",1994  ,"64c_wallsstreat  ",25000);  //assigning values by method calling
            Emp2.employeeDetails("Sam  ",2000  ,"68D- WallsStreat  ",35000);
            Emp3.employeeDetails("John  ",1999 ,"26B- WallsStreat  ",30000);
            
     }
    }
