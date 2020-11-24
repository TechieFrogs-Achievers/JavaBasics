public class StudentsDetails
 {
     //Student fields
     int rollNumber;
     String address;
     String name;
     long phonenumber;
     
    //Parameterized Constuctor with student details
     public StudentsDetails(int rollNo, String stu_address, String stu_name, long stu_phoneNumber)
     {
        
        //assigning values to students fields
        rollNumber=rollNo;
        address=stu_address;
        name=stu_name;
        phonenumber=stu_phoneNumber;
      /*System.out.println("******  "+name+" DETAILS******");
        System.out.println("name   :"+ address);
        System.out.println("name   :"+ rollNumber);
        System.out.println("name   :"+ phonenumber );  */
     }

     public  void details()
     {
        System.out.println("******  "+name+" DETAILS******");
        System.out.println("name   :"+ address);
        System.out.println("name   :"+ rollNumber);
        System.out.println("name   :"+ phonenumber ); 
     }

     public static void main(String[] uj)
     {
         //creation of objects for same class
         StudentsDetails stuobj1=new StudentsDetails(23,"nuzvid","Sam",984765422L);
         StudentsDetails stuobj2=new StudentsDetails(25,"rajahmundry","john",9847234456L);
         stuobj1.details();
         stuobj2.details();


     }
    
}
