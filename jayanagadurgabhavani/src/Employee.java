public class Employee 
{
    String name;
    int year;
    int salary;
    String address;
    // by used in string , int;
    public static void main(String[] args) 
    {
        // creating a constractor
    Employee emp1 = new Employee();
    emp1.name="Robert";
    emp1.year=1994;
    emp1.salary=22500;
    emp1.address="64C Wallsstreat";
    System.out.println("student1 name:" + emp1.name );
    System.out.println("student1 roll_no:" + emp1.year);
    System.out.println("student1 phone_no:" + emp1.salary);
    System.out.println("student1 address:" + emp1.address);
    Employee emp2= new Employee();
    emp2.name="john";
    emp2.year=1999;
    emp2.salary=23300;
    emp2.address="26B Wallsstreat";
    System.out.println("student1 name:" + emp2.name );
    System.out.println("student1 roll_no:" + emp2.year);
    System.out.println("student1 phone_no:" + emp2.salary);
    System.out.println("student1 address:" + emp2.address);
    Employee emp3 = new Employee();
    emp3.name="sam";
    emp3.year=2000;
    emp3.salary=24200;
    emp3.address="68D Wallsstreat";
    System.out.println("student1 name:" + emp3.name );
    System.out.println("student1 roll_no:" + emp3.year);
    System.out.println("student1 phone_no:" + emp3.salary);
    System.out.println("student1 address:" + emp3.address);
     }
}
