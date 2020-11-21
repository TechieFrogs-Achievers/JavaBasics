class Employee
{
    int  salary,yearOfJoining;
    String address,name;
    public Employee(String name,int yearOfJoining,int salary,String address){
        this.name= name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
        System.out.println(name + "       " + yearOfJoining + "       "+"     "+ salary + "       "+ address);
    }
}
public class ConstructorProgram10 {
    public static void main(String[] args) {
        System.out.println("Name" + "       " + "year of joining" + "   "+ "salary"+ "       "+"Address");
        Employee e1 = new Employee("Robert", 1994,20000,"64C- WallsStreat");
        Employee e2 = new Employee("Sam   ",2000,40000,"68D- WallsStreat");
        Employee e3 = new Employee("John  ",1999,35000,"26B- WallsStreat");

    }
}
