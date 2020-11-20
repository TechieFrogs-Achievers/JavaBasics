
  // Using Constructors with parameters printing name and rno of Student
public class Student {

    String name;
    int rno;
    Student(String stud_name,int stud_rno){
        name=stud_name;
        rno=stud_rno;
        
    }
    void display()
    {
        System.out.println(name+" "+rno);
    }
    public static void main(String[] args) {
        Student s1=new Student("john",2);
        s1.display();
        


        

    }
    
}
