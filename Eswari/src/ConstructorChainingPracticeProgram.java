class StudentDtails
{
    private StudentDtails()
    {
        int rollNo =522;
        String name = "eswari";
        System.out.println("Name of the student is  "+name +"  "+rollNo);
    }
    public StudentDtails(int age)
    {
        this();
        System.out.println("The age is "+age);
        
    }
    public StudentDtails(String branch)
    {
        this(22);
        System.out.println("The branch of that student is " + branch);
    }
}

public class ConstructorChainingPracticeProgram {
    public static void main(String[] args) {
        // StudentDtails studentsObj = new StudentDtails();
        // StudentDtails studentsObj1 = new StudentDtails(22);
        StudentDtails studentsObj2 = new StudentDtails("cse");
    }
    
}
