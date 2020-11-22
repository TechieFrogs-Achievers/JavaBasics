public class Employee {
    String name;
    int year;
    int salary;
    String address;
    Employee(String k,int h,int s,String b)
    {
        name=k;
        year=h;
        salary=s;
        address=b;
    }
    void input()
    {
        System.out.println(name+" "+year+" "+salary+" "+address);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert",1994,22500," 64C Wallsstreat");
        Employee emp2 = new Employee("john",1999,23300,"26B Wallsstreat");
        Employee emp3 = new Employee("sam",2000,24200,"68D WallsStreat");
        emp1.input();
        emp2.input();
        emp3.input();
        
    }
}
