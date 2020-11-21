public class Employee
 {
    String name;
    int yearOfJoining;
    String address;


    public void employeeDetails(String x,int y,String z)
    {
        name = x;
        yearOfJoining = y;
        address = z;
        System.out.println(name+" "+yearOfJoining+" "+address+" ");
    }

    public static void main(String[] args)
     {
        Employee Emp = new Employee();
            Emp.employeeDetails("Robert",1994,"64c_wallsstreat");
            Emp.employeeDetails("Sam",2000,"68D- WallsStreat");
            Emp.employeeDetails("John",1999,"26B- WallsStreat");
            
     }
    }
