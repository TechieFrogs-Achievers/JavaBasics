package InterfaceExercise;
// interface class
interface Data
{    
     // Data types
     String name ="emp_xyz";
     int id_no = 101;
     double salary = 35000;
     long phn_no = 675365555;  
    
    
}
// main class
public class InterfaceProgram4 //implements Data// implementing properties from interface
{
    public static void main(String[] args)
    {   
        // printing employee details
        /*System.out.println("...The employee Data....");
        System.out.println("emp_name:" +name);
        System.out.println("emp_id :" +id_no);
        System.out.println("emp_salary:"+salary);
        System.out.println("emp_phno:" +phn_no);*/
        System.out.println(Data.name);
        System.out.println(Data.id_no);
        System.out.println(Data.salary);
        System.out.println(Data.phn_no);

        
    }
    
    
}
