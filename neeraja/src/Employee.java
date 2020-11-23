public class Employee 
{
    String name;
    int year_Of_joining;
    long salary;
    String address;

    public Employee(String name, int year_Of_joining, long salary, String address)
    {
        this.name=name;
        this.year_Of_joining=year_Of_joining;
        this. salary=salary;
        this.address=address;

        System.out.println(name +"         "+year_Of_joining+ "                "+address  );

     }

     public static void main(String[] fv)
     {
        System.out.println("name           year_Of_joining           Address  ");
        System.out.println("----------------------------------------------------");
       
        //objects created to print employee details
         Employee empobj=new Employee("neeraja",2020,30000, "2-68/Nuzvid");
         Employee empobj1=new Employee("neeraja",2020,30000, "2-68/Nuzvid");
         Employee empobj2=new Employee("neeraja",2020,30000, "2-68/Nuzvid");
         System.out.println("----------------------------------------------------");


     }
    
}
