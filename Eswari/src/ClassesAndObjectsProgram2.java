class Students
{
    String name;
    int roll_number;
    long phone_number;
    String address;
    
    public Students(String std_name, int std_rollN0, long std_phnNum,String std_address)
    {
        name =std_name; 
        roll_number = std_rollN0;
        phone_number = std_phnNum;
        address = std_address;
        
    }
    void display()
    {
        
        System.out.println(name +"    "+roll_number +"   "+phone_number +"    " +address);
    }
}

public class ClassesAndObjectsProgram2 {
    public static void main(String[] args) {
        Students studentObj = new Students("Sam" ,1, 978456321, "Hyderabad");
        Students studentObj1 = new Students("John", 2, 987456321, "Rajahmundry");
        studentObj.display();
        studentObj1.display();
    }
    
}
