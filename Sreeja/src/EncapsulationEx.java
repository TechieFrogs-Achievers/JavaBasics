 class Employee1
{
    private String name;        //defining variables as private
    private float salary;

    public String getName()     //creating getter for name
    {
        return name;
    }
    public float getSalary()    //creating getter for salary
    {
        return salary;
    }
    public  void setName(String name)   //creating setter for name
    {
        this.name = name;
    }

    public void setSalary(float salary)     //creating setter for salary
    {
        this.salary = salary;
    }


} 



public class EncapsulationEx
 {
 
     public static void main(String[] args)
      
     {
       Employee1 emp = new Employee1();     //creating object for employee class
      
       emp.setName("Sreeja");
       System.out.println(emp.getName());   //method calling
       
       emp.setSalary(25000);
       System.out.println(emp.getSalary()); 
    }
}
