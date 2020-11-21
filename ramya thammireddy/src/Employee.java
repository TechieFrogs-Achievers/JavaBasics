public class Employee 
{
    String name;
    int year;
    long salary;
    String address;
    Employee(String n,int y,String add)
    {
        name=n;
        year=y;
        address=add;
    }
    void details()
    {
        System.out.println(name+"  "+year+"  "+address);
    }

    

public static void main(String args[])
{
    Employee emp=new Employee("Robert",1994,"WallStreet");
    Employee emp1=new Employee("john",1996,"Wallstreet");
    Employee emp2=new Employee("sam",1996,"Wallstreet");
    System.out.println("name"+"  "+"year"+"  "+"address");
    emp.details();
    emp1.details();
    emp2.details();
}
}