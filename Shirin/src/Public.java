 public class Public 
{
      //using public modifier
    String name;
    int id;
    String Address;

     public  void Accessmodifiers2(String emp_name , int emp_id , String emp_Address)
     {
         name = emp_name;
         id = emp_id;
         Address = emp_Address;
         
     }
     public void name()
      {
        
          System.out.println(name+ "  " +id + " " +Address);
      }
      public static void main(String[] args) 
      {
          Public a = new Public ();
          a.Accessmodifiers2("shirin",201 ,"rajamundry");



          
      }
      

      


    
}
