 class Member 
{
    String name;
    int age;
    long phoneNo;
    String address;
    float salary;
    public void salary()
    {
        System.out.println(salary);

    }
  }
  class  Employ extends Member{
    String spcialization;


  }
  class  Manager extends Member{
    String department;
  }


public class Member1
{

    public static void main(String args[]) {
     // Member1 m=new Member1();
      Employ e=new Employ(); //employee object creation
      e.name ="jaya";
      e.age=23;
      e.phoneNo=678934567;
      e.address="rjy";
     e.salary=50000;
      e.spcialization="frontend developer";
      e.salary();
      System.out.println(e.name +" " +e.age +" " +e.phoneNo +" " +e.address +" " +e.spcialization);
      Manager m=new Manager(); //member object creation
      m.name ="anupriya";
      m.age=20;
      m.phoneNo=1234567893;
      m.address="viz";
      m.salary=50000;
      m.department="  developer";
      m.salary();
      System.out.println(m.name +" " +m.age +" " +m.phoneNo +" " +m.address +" " +m.department);
   }
}