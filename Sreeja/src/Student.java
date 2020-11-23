public class Student
 {
    
    /*
      String name;          //defining variables
      int roll_no;
    
    
    public static void main(String[] args) 
    {
       Student s1 = new Student();      //creating an object for student class
       
         s1.name = "John";           //assigning values
         s1.roll_no = 2;

        System.out.println(s1.name);    //printing the values of the object
        System.out.println(s1.roll_no);
        
    }
    */

    

    
    String name;
    int rollNumber;
    long phoneNumber;
    String address;
     
    public static void main(String[] args)
      {
          Student s1 = new Student();       //creating objects for class student
          Student s2 = new Student();
        
        s1.name = "sam";        //assigning values for object s1
        s1.rollNumber = 2;
        s1.phoneNumber = 9452154321l;   
        s1.address = "vizag";
        
        System.out.println(s1.name+"  "+s1.rollNumber+"  "+s1.phoneNumber+"  "+s1.address); // printing the values
        
        s2.name = " John";          //assigning values for object s2
        s2.rollNumber = 3;
        s2.phoneNumber = 9445566779l; 
        s2.address = "kerala";
       
        System.out.println(s2.name+"  "+s2.rollNumber+"  "+s2.phoneNumber+" "+s2.address); // printing values


    }

    

    






}

