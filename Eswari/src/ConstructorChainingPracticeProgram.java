//constructor chaining example
class StudentDtails
{
    // default constructor 
    private StudentDtails()
    {
        int rollNo =522;
        String name = "eswari";
        System.out.println("Name of the student is  "+name +"  "+rollNo);
    }
    //parametarized constructor 
    public StudentDtails(int age)
    {
        this();             //calling default constructor by using this() constructor
        System.out.println("The age is "+age);
        
    }
    public StudentDtails(String branch)
    {
        this(22);              //calling int parametarized constructor by passing integer value to this constructor
        System.out.println("The branch of that student is " + branch);
    }
}

public class ConstructorChainingPracticeProgram {
    public static void main(String[] args) {
        // StudentDtails studentsObj = new StudentDtails();
        // StudentDtails studentsObj1 = new StudentDtails(22);
         new StudentDtails("cse");      //passing value to string parametarized constructor without creating object
    }
    
}
