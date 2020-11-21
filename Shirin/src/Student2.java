public class Student2
{
    String name ;
    int rollno;
    long phnno;
    String Address;

    Student2( String std_name, int std_rollno, long std_phnno, String std_Address)
    {
        name = std_name ;
       rollno = std_rollno;
       phnno =  std_phnno;
       Address = std_Address;


    }
    void demo()
    {
        System.out.println(name + " "+ rollno + " "+ phnno + " " + Address);
    }
    public static void main(String[] args) 
    {
        Student2 s1 = new Student2(" Sam "  ,  21 ,  984567884 ,  " rajahmundry ");
        Student2 s2 = new Student2( " john " , 22 ,  876589635 ,  " rajahmundry ");
        s1.demo();
        s2.demo(); 
        
    }

    
}
