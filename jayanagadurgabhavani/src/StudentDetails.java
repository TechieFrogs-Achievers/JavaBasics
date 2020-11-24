public class StudentDetails 
{
    String name;
    int age;
    String adderss;
    //creating a constractor
    StudentDetails()
    {
        name="unknows";
        age=0;
        adderss="not available";
    }
    //only methode ceating by age and address
    public void setInfo(int age, String address)
    {
        System.out.println("student age is:"+age);
        System.out.println("student address is:"+address);
    }
    //methode creating by name age address
    public void setInfo(String name, int age,  String address)
    {
        System.out.println("student name is:" +name);
        System.out.println("student age is:"+age);
        System.out.println("student address is:"+address);
    }
    public static void main(String[] args)
     {
        StudentDetails sd=new StudentDetails();
        sd.setInfo(23, "veeravaram");//given by the value
        sd.setInfo("jaya", 23, "veeravaram");//given by the value
    }
}
