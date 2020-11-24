public class ThisExample1
{ 
     String stdname;
     int rollno;
     String sec;
 ThisExample1(String stdname,int rollno,String sec)// parametrized constructor 
{
    this.stdname =stdname; //both local and instance variables are same in this case we can use "this keyword" 
    this.rollno = rollno;
    this. sec = sec;
}  
public void display() //method to print details 
{
    System.out.println( stdname +"    " + rollno +"    " +sec);
} 

    public static void main(String[] args) 
    {
        ThisExample1 sc =  new ThisExample1("john", 1, "A");
        sc.display();
        
    }

    
} 

