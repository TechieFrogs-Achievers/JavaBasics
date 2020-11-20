class Studenta
{
    String name ;
    int roll_no ;
    long mobile_no ;
    String address ;
    public Studenta (String name , int roll_no , long mobile_no , String address )
    {
        System.out.println(" Name : " + name + " Roll Number : " + roll_no + " Mobile Number : " + mobile_no + " Address : " + address);
    }
}
public class OC2
{
    public static void main(String []args )
    {
        Studenta st1 = new Studenta("Sam", 1 , 9493991230L, "Ydl");
        Studenta st2 = new Studenta("John" , 2 , 9182080963L , "Kgm");
    }
}
