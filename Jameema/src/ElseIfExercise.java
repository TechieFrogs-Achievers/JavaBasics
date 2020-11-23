public class ElseIfExercise
{
    public void Sample()
    {
        int age=19;
        String edu="degree";
        if(age>18) // condition is true
        {
            System.out.println("the person id elgible for army");
        }
        else if(age<21 & edu=="degree") //first condition is false and present condition is true
        {
            System.err.println("the person is eligible fpr army");
        }
        else //condition is false
        {
            System.out.println("the person is not elgible for army");
        }  

    }
    public void Sample1()
    {
         int empId=101;
         String name="jemima";
         double salary=50356.56d;
         int bonus=5000;
         String exp="2y";
         if(empId==105) // condition is true
         {
             System.out.println("the employeeid is 101");
         }
         else if(name == "priskilla" && empId==101) //first condition is false and present condition is true
         {
             System.out.println("priskilla empid is 101");
         }
         else if(salary==50356.56 && exp=="2y") //first and second condition is false and present condition is true
         {
             double a=salary+bonus;
             System.out.println("the employee salary is add with bonus:" +a);

         }
         else //condition is false
         {
             System.out.println("the employee dosent exist");
         }     
    }
    public static void main(String[] args)
     {
         ElseIfExercise e = new ElseIfExercise(); // calling class by using object
         e.Sample(); //calling method by using method
         e.Sample1();
    }

    
}
