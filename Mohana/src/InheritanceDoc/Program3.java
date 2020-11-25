package InheritanceDoc;

class Member //parent class
{
   String name;
   int age;
   long number;
   String address;
   double salary;
   
   public void printSalary()//method to print salary
   {
       System.out.println(salary); 
   }  
}
   class Employee extends  Member //employee class exteds member class  as parent class
   {
        String specialization;
   } 
   class Manager extends Member //manager class extends member class as parent class
   {
       String department;
   }

public class Program3 
{
    public static void main(String[] args) 
    {

    Employee emp = new Employee(); //object for employee class
    emp.name = "John"; 
    emp.age = 25;
    emp.number = 9876432245l;
    emp.address = " Hyderabhad";
    emp.salary = 25000; 
    emp.specialization = "Btech";
    System.out.println(emp.name + "---- ---"+emp.age + "---------"+emp.number+ "------" +emp.address+ "-----" +emp.salary+"---"+emp.specialization );
    
    Manager mng = new Manager();//object for manager class
    mng.name = "David";
    mng.age = 30;
    mng.number = 78965435677l;
    mng.address = "Secundrabhad";
    mng.salary = 45000;
    mng.department = " Managing Director ";
    System.out.println(mng.name + "---- ---"+mng.age + "---------"+mng.number+ "------" +mng.address+ "-----" +mng.salary+"---"+mng.department );
    

    }
    
}