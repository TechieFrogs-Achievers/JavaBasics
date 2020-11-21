public class Student1 
{
    String name ;
    int rollno ;
    Student1( String std_name , int std_rollno )
    {
        name = std_name;
        rollno= std_rollno;

    }
    void demo()
    {
        System.out.println(name + " " +rollno);
    }


    public static void main(String[] args)
    {
        Student1 s = new Student1("john" ,  2);
        s . demo();
        
    }
    
}
