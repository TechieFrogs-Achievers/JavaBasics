interface Drawale
{
   void draw();
}
class Angle implements Drawale
{
   public void draw()
    {
        System.out.println(" this is rectanglr");
    }
}
class Cricle implements Drawale
{
    public void draw()
    {
        System.out.println(" this is cricle");
    }

}
public class Interface1
{
     public static void main(String[] args) 
    {
        Drawale d=new Cricle();
        d.draw();
        Drawale r=new Angle();
        r.draw();

    }
}
