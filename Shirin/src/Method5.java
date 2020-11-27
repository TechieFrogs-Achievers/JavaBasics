class Degree 
{
     public void getDegree()// creating method
     {
         System.out.println(" I got Degree");
     } 

    
}
// sub class 
class Undergraduate extends Degree
{
    public void getDegree()
    {
        System.out.println(" I am an Undergratuate");
    }

}
//sub class
class Postgraduate extends Degree
{
    public void getDegree()
    {
        System.out.println(" I am a postgraduate");
    }
}
public class Method5
{
     public static void main(String[] args)
     {
         //creating object
         Degree d = new Degree();
         Undergraduate u = new Undergraduate();
         Postgraduate p = new Postgraduate();
         //calling method with object 
         d.getDegree();
         u.getDegree();
         p.getDegree();


     } 


    
}
