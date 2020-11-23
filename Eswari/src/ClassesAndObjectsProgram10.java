//employee class for printing details of employee 
class Employees
{
    String name;
    int yearOfJoining;
    int salary;
    String address;

    //constructor
    public Employees(String n, int j,int s,String a)
    {
        name= n;
        yearOfJoining = j;
        salary = s;
        address = a;
        System.out.println(name +"      " +yearOfJoining +"             " +salary +"        " +address);
    }
}

public class ClassesAndObjectsProgram10 {
    public static void main(String[] args) {
        System.out.println("Name" +"        " +"Yearofjoining" +"     " +"Salary" +"      " +"Address");
        Employees e= new Employees("Robert", 1994, 20000, "64C- WallsStreat");  //passing details of one employee
        Employees e1= new Employees("Sam  ", 2000, 25000, "68D- WallsStreat");   //passing details of another employee
        Employees e2= new Employees("John ", 1999, 30000, "26B- WallsStreat");   //passing details of another employee


        
    }
}
