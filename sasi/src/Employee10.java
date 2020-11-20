public class Employee10 
{
    String name;
    int year;
    int salary;
    String address;
    Employee10(String n,int y,int s,String add  )
    {
        name=n;
        year=y;
        salary=s;
        address=add;
    }
    void details()
    {
        System.out.println(name+" "+year+" "+address+" "+salary);
    }
    public static void main(String[] args)
     {
        Employee10 emp=new Employee10("robert", 1994,1000,"64c-wallsStreat");
        Employee10 emp1=new Employee10("jhon", 1996,30000, "68d-wallsStreat");
        Employee10 emp2=new Employee10("SAM", 1996, 40000,"26b-wallsStreat");
        System.out.println("name"+" "+"year"+" "+"salary"+"address");
        emp.details();
        emp1.details();
        emp2.details();
    }
    }
    

