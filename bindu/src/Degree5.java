public class Degree5 
{
    //creating the method
    public void getDegree()  
    {
        System.out.println("I Got A DEGREE:");
    }
}
    class undergraduate extends Degree5   //subclass inherits the parent class 
    {
        public void getDegree()
        {
        System.out.println(" I AM AN UNDERGRADUATE:");
        }
    }
    class postgraduate extends Degree5   //subclass inherits the parent class
    {
    public void getDegree()
    {
        System.out.println("I AM AN POSTGRADUATE:");
    }
    public static void main(String[] args) 
    {
        Degree5 D = new Degree5();    //creating object for the class
        D.getDegree();           //calling the method with object D
        undergraduate u = new undergraduate();
        u.getDegree();
        postgraduate p = new postgraduate();
        p.getDegree();
    }
    
}
