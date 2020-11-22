public class Employee1 
{
    String name;
    long yearOfJoining;
    double salary;
    String address;

    //creating a constructor for initilize data

    public Employee1(String name, long yearOfJoining, double salary, String address)
    {
        this.name = name ;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
     public static void main(String[] args)
    {
        System.out.println("Name" + "       " + "year of joining" + "   "+ "salary"+ "       "+"Address");
        Employee1 e1 = new Employee1("Robert",1994,20000,"64C- WallsStreat");
        Employee1 e2 = new Employee1("Sam   ",2000,40000,"68D- WallsStreat");
        Employee1 e3 = new Employee1("John  ",1999,35000,"26B- WallsStreat");

    }
}
