public class Degree 
{
   public void getDegree()
   {
       System.out.println("I got a Degree");
   }

    public static void main(String[] args) 
    {
      Degree d=new Degree();//object creation
      d.getDegree();//calling method
      Undergraduate ug=new Undergraduate();//object create for undergraduate class
      ug.getDegree(); //calling method
      Postgraduate pg=new Postgraduate();//object create for postgraduate class
      pg.getDegree();//calling method 
    }
}
//inherite the method from Degree class to undergraduate class
class Undergraduate extends Degree
{
 public void getDegree()
 {
     System.out.println("I am a UnderGraduate");
 }
}
//inherite the method from Degree class to postgraduate class
class Postgraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am a PostGraduate");
    }
}