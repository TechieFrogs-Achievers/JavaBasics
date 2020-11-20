public class Employee 
{
     String name;
     int yearofjoining;
     long salary;
     String Address ;
     Employee (String n , int y , long s , String a )
     {
         name = n;
         yearofjoining = y ;
         salary = s;
         Address = a;
         System.out.println(name + "  "+ yearofjoining + "  " + salary + "  " + Address);
         

     }
    

  public static void main(String[] args) 
  {
     System.out.println("name" + "  "+ "yearofjoining" + "  " + "salary" + "  " + "Address");
     Employee e1 = new Employee("Robert",1994,20000,"64C - WallsStreat" );
     Employee e2 = new Employee("Sam"     ,   2000,25000, "68D - WallsStreat" );
     Employee e3 = new Employee("John",     1999,30000,"26B - WallsStreat" );
     
  }
}

    
    
