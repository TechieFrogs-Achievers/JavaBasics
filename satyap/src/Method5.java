class Degree // Pareent class
{
    void display()
    {
        System.out.println("I got a Degree");
    }
}
class UnderGraduate extends Degree // child class
{
    void display()
    {
        
        System.out.println("I am a Undergraduate degree");
    }
}
class PostGraduate extends Degree // childclass
{
    void display()
    {
        
        System.out.println("I am Post graduate Degree ");
    }
}
public class Method5 // main method
{
    public static void main(String[] args)
    {
    
    PostGraduate pg=new PostGraduate(); //obj creation for child class Post graduation 
    pg.display();
    UnderGraduate ug=new UnderGraduate(); // obj creation for child under graduation
    ug.display();
    Degree d=new Degree(); // obj creation for degree class ie parent class
    d.display();
    }
}
