public class AreaSqueare 
{
    int lenght;
    int breadth;
    int side;
    public void Area(int length,int breadth)
    {
        //methode of area
       int area = length*breadth;
         System.out.println("area of rectanangle:" +area);
    }
    public void Squeare(int side)
    {
        //methode on area
        int Squeare = side*side;
        System.out.println(" seqear of rectanangle:" +Squeare);
    }
    public static void main(String[] args)
     {
        AreaSqueare as=new  AreaSqueare();
        as.Area(566,528);//accedhin values
        as.Squeare(566);//accesdhing of value
    }
}
