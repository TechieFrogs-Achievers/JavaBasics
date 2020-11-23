public class ThisExample3 
{ 
    /* by using this keyword we can call one constructor into another constructor */
    ThisExample3()
    {
       System.out.println( " default constructor ");
    } 
    ThisExample3( String name)
    {
        this(); //calling default constructor by using this keyword
        System.out.println(name);
    }  
     public void display() //method without parameters
    { 
        System.out.println( "Java language");

    } 
    public void details()
    {
        this.display(); //calling above method
        System.out.println("c language ");
    }  
    public void show()
    {
        this.details(); //calling above method 
        System.out.println( "c++ language");

    }
    public static void main(String[] args) 
    { 
        ThisExample3 ex = new ThisExample3( " Parametrized constructor");
          ex.show(); // the flow of methods will be  first parent method details then below methods
    }
}  
    

