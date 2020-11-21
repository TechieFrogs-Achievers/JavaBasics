public class Student {
    String name;
    int rno;
    Student(String std_name,int std_rno)
    {
        name=std_name;
        rno=std_rno;
    }
    void display()
    {
        System.out.println(name+" "+rno);
    }
    public static void main(String[] args) 
    {
      Student std = new Student("john"+" ",2);
      std.display();  
    }
    
}
