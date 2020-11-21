public class Employee 
{
    String name;
    int yearOfJoining;
    double salary;
    String address; 

    // parametrized constructor having above parameters
    Employee( String n, int yoj,double sal, String add)
    { 
        
     name = n ;
     yearOfJoining = yoj;
    salary = sal;
     address = add;

    } 
    public void displayDetails()  //method to display emp details
    {
        System.out.println( name + "         " +yearOfJoining+ "          "+ salary+ "         " +address);
    } 

    public static void main(String[] args) 
    { 
        System.out.println("name            yoj        salary        address");
       Employee emp1 = new Employee("Robert", 1994, 25000, "64D- WallsStreet");
       Employee emp2 = new Employee("sam", 2000, 35000, "68C- WallsStreet");
       Employee emp3 = new Employee("John", 1999, 20000, "26B- WallsStreet");
       emp1.displayDetails();
       emp2.displayDetails();
       emp3.displayDetails();

        
    }
    
}
