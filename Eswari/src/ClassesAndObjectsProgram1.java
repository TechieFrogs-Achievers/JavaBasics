//class student is creating for printing name and roll number
class Student
{
    String name;
    int rollNo;

    // parametarized constructor 
    public Student(String stdName, int stdRoll_no)
    {
        name= stdName;
        rollNo=stdRoll_no;
        // System.out.println();
        
        // System.out.println(name +" --------" +roll_no    );
    }

    // default constructor
    public Student()
    {
        int rollNum;
    }
}
public class ClassesAndObjectsProgram1 {
    public static void main(String[] args) {
        Student studentObj = new Student("John", 2);  //object creation
        // studentObj.name="John";
        // studentObj.rollNo=2;
        System.out.println(studentObj.name +"   " +studentObj.rollNo);
    }
    
}
