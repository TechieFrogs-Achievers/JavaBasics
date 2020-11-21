public class Student 
{
    /*String name = " John ";
    int rollNo = 2; 
    public static void main(String[] args) 
    {
        Student std = new Student();
        System.out.println( std.name + "-- " + std.rollNo );
        
    }*/ 
    String name;
    int roll_No ;
    long phoneNo ; 
    String address;
    Student(String na , int roll ,long phone , String add)
    { 
        name = na;
        roll_No = roll;
        phoneNo = phone;
        address = add;

    }
    public static void main(String[] args) 
    {
        Student std1 = new Student(" John" , 1, 9876543210l, "Hyd");
        Student std2 = new Student( " Sam" , 2 , 987612340l, "Rjy");
        System.out.println( std1.name + " -----" +std1.roll_No + " ---" +std1.phoneNo+ "---" + std1.address);
        System.out.println(std2.name + " -----" +std2.roll_No + " ---" +std2.phoneNo+ "---" + std2.address);
        
    }
}
