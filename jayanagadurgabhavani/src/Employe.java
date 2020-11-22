public class Employe 
{
    String name;
    int year;
    int salary;
    String address;
    Employe(String n,int y,int s,String add  )
    //emp datails of name,year, salary,add
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
         // use in constroctor
        Employe emp=new Employe("robert", 1994,1000,"64c-wallsStreat");
        Employe emp1=new Employe("jhon", 1996,30000, "68d-wallsStreat");
        Employe emp2=new Employe("SAM", 1996, 40000,"26b-wallsStreat");
        System.out.println("name"+" "+"year"+" "+"salary"+"address");
        emp.details();
        emp1.details();
        emp2.details();
    }
}
