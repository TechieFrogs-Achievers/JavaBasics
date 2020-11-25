package Methods;

//class super class
class Degree
{
    public void getDegree()
    {
        System.out.println("I got degree");
    }
}

//subclass as under graduate
class UnderGraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
}

//second sub class for Degree super class
class PostGraduate
{
    //same method as parent class
    public void getDegree()
    {
        System.out.println("I ama an Postgraduate");
    }
}

public class MethodExample4 
{
    public static void main(String[] args) {
        PostGraduate pg = new PostGraduate();                   //sub class onject creation
        pg.getDegree();                                         //method calling using object
        UnderGraduate ug = new UnderGraduate();                 //another sub class object creation
        ug.getDegree();
        Degree d = new Degree();                                //super class object creation
        d.getDegree();
    }
    
}
