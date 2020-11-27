//Method overloading
public class SampleExercise3 
{ 
    //creating method
    void Method(String std_name )// using  one paramater
    {
        System.out.println("Student name :"+std_name);// printing std_name
        
    }
    void Method( int std_id)
    {
        System.out.println("Student id :"+std_id); 
    }
    void Method(long std_phno, String std_Address )//  two parameters 
    {
        System.out.println("phno:"+std_phno+" "+ " , "+"Address:"+std_Address);// printing long&string data types
    }
    public static void main(String[] args) 
    {   
        //creating object for class
        SampleExercise3 s = new SampleExercise3();
        // calling methods with object
        s.Method("Shirin");
        s.Method(502);
        s.Method(68393762,"rjy");
    }
    
   
    
}
