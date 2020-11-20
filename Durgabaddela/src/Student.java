public class Student 
{
    String name;
    int roll_no;
     
    public static void main(String[] args)
    {
       Student s = new Student() ;
       s.name = "Jhon";
       s.roll_no = 2;
       System.out.println(s.name+" "+ s.roll_no);
    }
}
