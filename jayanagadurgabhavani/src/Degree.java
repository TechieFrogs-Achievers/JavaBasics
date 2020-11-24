public class Degree 
{
    public void getdegree()
    {
        System.out.println(" i got a degree");
    }
    public static void main(String[] args) 
    {
        Degree gd=new Degree();
        gd.getdegree();//creating a object
        Undergraduate ug=new Undergraduate();//methode
        ug.getdegree();
        Postgraduate pg=new Postgraduate();//methode
        pg.getdegree();
    }}
    class Undergraduate extends Degree
  {
    public void getDegree()
   {
     System.out.println("I am a UnderGraduate");
    }}
   class Postgraduate extends Degree
  {
    public void getDegree()
    {
        System.out.println("I am a PostGraduate");
    }
}
