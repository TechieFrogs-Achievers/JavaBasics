class Member
{
    int age ;
    String name ;
    long mobile ;
    double salary ;
    String address ;
    public void printSalary()
    {
        System.out.println(salary);
    }
}
class Employee extends Member
{
    String specification ;
}
class Manager extends Member
{
    String department ; 
}
class Inheritance3 extends Member
{
    public static void main(String[] args)
    {
        Employee e = new Employee ();
        e.name = "Hari";
        e.age = 21 ; 
        e.mobile = 9493991230L ;
        e.salary = 30000 ;
        e.address = "Yadavole , Devarapalli Mandal";
        e.specification = "xyz" ;
        e.printSalary();

        Manager m = new Manager ();
        m.name = " abc " ;
        m.age = 30 ;
        m.mobile = 9876543210L ;
        m.salary = 50000 ;
        m.address = "Koyyalagudem" ;
        m.department = "klm";
    }
}

