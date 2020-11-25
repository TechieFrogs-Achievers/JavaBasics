class Banana 
{
    int no_of_items = 7;        //assigning value

    public Banana()         //constructor
    {
       
    }
    void show()     //method to print
    {
        
        System.out.println(no_of_items);
    }
   
}


class Apple extends Banana
{

    int no_of_items = 6;        //assigning value
 
    
}



public class InheritanceEx10
 {
     public static void main(String[] args) 
     {
        Apple a = new Apple();
        a.show();
    }

}  
