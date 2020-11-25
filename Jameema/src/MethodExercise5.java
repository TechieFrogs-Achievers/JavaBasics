class Degree
{
    public void getDegree() //creating method
    {
        System.out.println("i got degree"); 
    }
}
class Undergraduate extends Degree //inherits parent details
{
    public void getDegree() //method for childclass
    {
        System.out.println("i am an Undergraduate");
    }
}
class Postgraduate extends Degree //inherits parentclass
{
    public void getDegree()
    {
        System.out.println("i am a Postgraduate");
    }
}
public class MethodExercise5
 {
     public static void main(String[] args)
      {
          Degree d = new Degree(); //creating object 
          Undergraduate u = new Undergraduate();
          Postgraduate p = new Postgraduate();
          d.getDegree(); //calling method
          u.getDegree();
          p.getDegree();  
     }
    
}
