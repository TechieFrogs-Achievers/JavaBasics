class Teacher
{
    String collegeName = "ISTS";        //assigning variable

    public void display()           //method to diaplay
    {
        System.out.println("Iam a teacher");
    }
}
    public class InheritanceExample extends Teacher     //child class inherits the parent class
    {
        String subject = "Maths";       //assigning variable
         public static void main(String[] args) 
            
        {
            InheritanceExample mt= new InheritanceExample();        //creating object
           
            mt.display();       //method calling
           
            System.out.println(mt.collegeName);    
        }
        
        

        
    
    }













 
    

