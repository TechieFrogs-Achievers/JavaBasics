public class StudentDetails
 {
     String name;
     int RollNo;
     Long Phno;
     String Address;

     StudentDetails(String StdName , int StdId , long StdNo , String StdAddress)
     {
         name=StdName;
         RollNo=StdId;
         Phno=StdNo;
         Address=StdAddress;
        
     }
     public void display()
     {
        System.out.println(name + " " +RollNo+ " " +Phno+ " "+ Address);

     }
     public static void main(String[] args) 
     {
         StudentDetails sd = new StudentDetails("sam", 101, 789654123, "Angara");
         StudentDetails sd1 = new StudentDetails("john", 123, 987456321, "rajahmundary");
         sd.display();
         sd1.display();
         
     }
    
}
