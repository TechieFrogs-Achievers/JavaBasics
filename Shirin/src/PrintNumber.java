public class PrintNumber 
{   //method using with parameter
    //Assigning different members in parameters
     void Printn( String name)
    {
        System.out.println(name);
    }
    void Printn( int Id)
    {
        System.out.println(Id);
        
    }
    void  Printn(float salary )
    {
        System.out.println(salary);
    }
    void Printn(long phnno)
    {
        System.out.println(phnno);
    }
    public static void main(String[] args) 
    {
        PrintNumber p = new PrintNumber(); // creating object for class
        //calling methods with object
        p.Printn("jamee");
        p.Printn(504);
        p.Printn(25000);
        p.Printn(765544349);
        
    }
    
    
}
