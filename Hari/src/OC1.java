class Student
{
    String name ; 
    int roll_no ;
    public Student ( int roll_no , String name ) 
    {
        System.out.println("Roll number : " + roll_no +  " Name : " + name );
    }   
}
public class OC1
{
    public static void main(String []args)
    {
        Student st1 = new Student ( 2 , "John" );
    }
}
