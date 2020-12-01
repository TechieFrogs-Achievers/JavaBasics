public class SampleExercise1 
{    
    // Method overloading
     // Method with parameters
     void display(String emp_name ,int emp_id )
    {
         
        System.out.println(emp_name+" "+emp_id);
        System.out.println("the employee name is" +emp_id);
    }
    void display(float emp_salary, double emp_phno )
    {
        System.out.println(emp_salary+" "+emp_phno);
    }
    public static void main(String[] args) 
    {   
        //creating object for class
        SampleExercise1 s = new SampleExercise1();
        // calling methods with object
        s.display("xyza",121);
        s.display(3500.00f ,68393762);
    
        
    }
    
}
