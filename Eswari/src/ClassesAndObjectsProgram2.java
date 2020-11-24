// students class for printing name, rollNo, phoneNmuber and address
class Students
{
    String name;
    int roll_number;
    long phone_number;
    String address;
    
    //  parametarized constructor
    public Students(String std_name, int std_rollN0, long std_phnNum,String std_address)
    {
        name =std_name; 
        roll_number = std_rollN0;
        phone_number = std_phnNum;
        address = std_address;
        
    }

    // display method for printing those values 
    void display()
    {
        
        System.out.println(name +"    "+roll_number +"   "+phone_number +"    " +address);
    }
}

// this is the main class
public class ClassesAndObjectsProgram2 {
    public static void main(String[] args) {
        Students studentObj = new Students("Sam" ,1, 978456321, "Hyderabad");  //first object creation for printing sam's details
        Students studentObj1 = new Students("John", 2, 987456321, "Rajahmundry");  //second object creation for printing john's details 
        studentObj.display();   //display method is calling by first object
        studentObj1.display();  //display method is calling by second object
    }
    
}
