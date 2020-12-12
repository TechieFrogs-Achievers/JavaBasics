package ExceptionsExercise;

//java program to handle CloneNotSupportedException
//cloneable is an interface
class EmployeeName implements Cloneable
{
    private String empName;    //private type variable
    public EmployeeName(String empName)             //constructor
    {
        this.empName = empName;
    }
    //getmethod for taking name of employee
    public String getName()
    {
        return empName;             //returning name 
    }
    //here object is an class and clone is an method of cloneable interface
    //and we don't use clone method without implementing the cloneable interface
    public Object clone() throws CloneNotSupportedException
    {
        return (EmployeeName) super.clone();                //calling clone method from super class
    }
        
}
//driver class
public class Example16 
{
    public static void main(String[] args) 
    {
        EmployeeName emp = new EmployeeName("eswari");              //creating object for employeeName class
        //try block for taking exceptions
        try 
        {
            EmployeeName emp1 = (EmployeeName) emp.clone();
            System.out.println(emp1.getName());   
        } 
        //catch block for handling exceptions
        catch (CloneNotSupportedException c) 
        {
            System.out.println("CloneNotSupportedException is Occured");
        }
        
    }
    
    
}
