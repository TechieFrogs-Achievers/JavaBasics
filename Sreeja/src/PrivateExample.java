public class PrivateExample
 {
    private String name = "sreeja"; //assigning values
    private int num =  57;

    private void display() // creating display method
    {
        System.out.println("Name:"+name+" "+"Number:"+num);
    }
    
    public static void main(String[] args)
     {
            PrivateExample pt = new PrivateExample(); //object creation
           
            pt.display(); // calling method within the class
    }


}
