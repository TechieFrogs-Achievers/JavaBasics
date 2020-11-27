public class Polymorshism2 
{
    void add(int a, int b)
    {
      System.out.println("sub:"+" " +(a-b));//sub
    }
    void add(float a, float b)
    {
        System.out.println("sub:"+" " +(a-b));//sub
    }
    public static void main(String[] args)
     {
        Polymorshism2 pl=new Polymorshism2();
        pl.add(11,11);//asseding value
        pl.add(22.5f,33.6f);//assending value
    }
}
