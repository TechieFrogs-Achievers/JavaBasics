package InterfaceExercise;
/*interface classes
   Cse
   Ece
   Mech
   */ 
interface Cse
{
    public String std_name1(String s1);// Method with parameters
    public void std_id1( int id1);
}
interface Ece
{
    public String std_name2(String s2 );
    public void std_id2(int id2);
}
interface Mech
{
    public String std_name3(String s3);
    public  void std_id3(int id3);
}

// Deoartment interface extends 3 interface details
interface Department extends Cse, Ece ,Mech
{
    public void display(String Details);
    public void display1( int Details1);
}

// class for implementing interface classes
class College implements Department 
{
    public String std_name1(String s1)
    {
         String Details = s1;
          return Details;
    }

    public void std_id1(int id1)
    {    
        int Details1 = id1;
        System.out.println(Details1);
    }

    public String std_name2(String s2)
    {
        String Details = s2;
        return Details;
    }

    public void std_id2( int id2)
    {   
        int Details1 = id2;
        System.out.println(Details1);
    }

    public String std_name3(String s3)
    {
        String Details = s3;
        return Details;
    }

    public void std_id3( int id3)
    {
        int Details1 = id3;
        System.out.println(Details1);
    }
// Department  class methods
    public void display(String Details)
    {
        System.out.println("Student Name :" +Details);
    }

    public void display1( int Details1)
    {
        System.out.println(" Student ID :" +Details1);
    }
}
// Main class
public class InterfaceProgram6 
{
    public static void main(String[] args)
    {
        College c = new College();// creating object for displaying student details
        c.display("john");
        c.display1(21);
        c.display("sam");
        c.display1(31);
        c.display("Ram");
        c.display1(41);


        
    }
    
}
