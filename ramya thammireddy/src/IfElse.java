 class IfElse 
 {
    public static void main(String args[])
    {
       int x= 30;
       if(x<20)
       {
          System.out.println("this is if statement");
         
       }
       else
       {
          System.out.println("this is else statement");

       }

    }

 }
// if else statement using boolean values
class Demo
{
   public static void main(String args[])
   {
      boolean a,b,c;
      a=b=c=true;
      if(!a||(b&&c))
      {
         System.out.println("executed");
      }
      else
      {
         System.out.println("not executed");

      }

   }
}
//student details program
class student
{
   public static void main(String args[])
   {
      String studentName = "ramya";
      int StudentId = 576;
      float studentfee = 50000.00f;
      String year   = "1year";
      if(studentName == "ramya" && StudentId == 335)
      {
         System.out.println("studentname is =" +studentName);

      }
      else 
      {
         System.out.println("studentname is not exist");
      }
      if(studentfee == 50000.00f && year =="1year")
      {
         System.out.println("studentfee is =" +studentfee+year);

      }
      else
      {
         System.out.println("student is not having a year");
      }
   }
}
   
    

   




    

