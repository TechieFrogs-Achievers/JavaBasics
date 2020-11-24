
 class Employee
  {
    //instance variables
    int  salary,yearOfJoining;
    String address,name;
    //parametrised constructor
    public Employee(String n,int year,int s,String a)
    {
        name= n;
        yearOfJoining = year;
        salary =s;
        address=a;

    }
}
 
   public class Employee1()
    {
    public static void main(String[] args)
     {
        System.out.println("Name" + "       " + "year of joining" + "   "+ "salary"+ "       "+"Address");
        //same class with  different objects
        Employee e1 = new Employee("Robert", 1994,20000,"64C- WallsStreat");
        Employee e2 = new Employee("Sam   ",2000,40000,"68D- WallsStreat");
        Employee e3 = new Employee("John  ",1999,35000,"26B- WallsStreat");
    }

    
    }
