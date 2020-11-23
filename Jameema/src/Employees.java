public class Employees
 {
     public void Details(String name , int YOF , long salary , String Address) //parameterised method
     {
         System.out.println(name+ "     " +YOF+ "          "+salary+ "     "+Address); //printing the parameters

     }
     public static void main(String[] args) 
     {
         System.out.println("name     yearofpassing    salary        Address");
         Employees e = new Employees(); //creating object to class
         e.Details("robert", 1994, 354666, "64c-WallsStreet");
         e.Details("sam  ",  2000, 494666, " 68B-WallsStreet"); //calling methods using object
         e.Details("john  ", 1999, 654666, "26B-WallsStreet"); //passing values to methods

         
     }
    
}
