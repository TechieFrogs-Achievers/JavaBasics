public class InheritanceExample3 
{
   public static void main(String[] args) 
   {
     Employeex e=new Employeex();//object create for employee details
     //assign values
     e.name="jhon";
     e.age=25;
     e.address="1-xy,rajahmundry";
     e.phone_number=1258964358l;
     e.salary=36000f;
     e.specialization="developer"; 
     System.out.println("---------Employee Details---------");
     System.out.println("name="+e.name+"\n"+"age="+e.age+"\n"+"address="+e.address+"\n"+"salary="+e.salary+"\n"+"phone number="+e.phone_number+"\n"+"specialization="+e.specialization);
     Manager m=new Manager();//object create for employee details
     //assign values
     m.name="abi";
     m.age=25;
     m.address="ad-xy,rajahmundry";
     m.phone_number=2589631457l;
     m.salary=36000f;
     m.department="IT Department";
     System.out.println("---------Manager Details-------");
     System.out.println("name="+m.name+"\n"+"age="+m.age+"\n"+"address="+m.address+"\n"+"salary="+m.salary+"\n"+"phone number="+m.phone_number+"\n"+"department="+m.department);
   } 
}
//parent class
class Member
{
    String name,address;
    int age;
    long phone_number;
    float salary;
    public void printSalary()
    {
        System.out.println("salary:"+salary);
    }

}
//subclass of the member class
class Employeex extends Member
{
    String specialization;
}
//subclass of the member class
class Manager extends Member
{
    String department;
}