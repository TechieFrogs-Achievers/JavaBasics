class Degree
{
    public void getDegree()     //metod for printing
    {
        System.out.println("I got a degree");
    }
}

class UnderGraduate extends Degree
{
    public void getDegree()         //overridden method for printing from parent class
    {
        System.out.println("I am an Undergraduate");
    }
}

class PostGraduate extends Degree       // overridden method
{
    public void getDegree()
    {
        System.out.println("I am a post graduate");
    }
}

public class Methods5 
{
     public static void main(String[] args) 
     {
        Degree d = new Degree();        //object creation for parent class

        UnderGraduate ug = new UnderGraduate(); //object creation for child class
       
        PostGraduate pg = new PostGraduate();       //object creation for another child class
        
        //calling method with objects of three classes
        
        d.getDegree();
        ug.getDegree();     
        pg.getDegree();
    }
}
