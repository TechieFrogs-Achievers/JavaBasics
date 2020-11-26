class Apple
{

    int no_of_items = 6;        //assigning value
 
    
}




class Banana extends Apple      //child class inherits the properties of parent class
{
    int no_of_items = 7;        //assigning value

    public Banana()         //constructor
    {
       
    }
    void show()     //method to print
    {
        System.out.println(super.no_of_items);
        System.out.println(no_of_items);
    }
   
}

public class InheritanceEx10
 {     public static void main(String[] args) 
     {
        Banana B = new Banana();        // creating object for child class
        B.show();       //method calling

        

    }

}  
