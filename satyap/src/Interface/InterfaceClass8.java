package Interface;

interface Pack
{
    void pack();
}
public class InterfaceClass8
{
    public class Sample4 implements Pack
    {
       public void pack()
       {
           System.out.println("Package created");
       }
    }
    public static void main(String[] args) {
        InterfaceClass8 in=new InterfaceClass8();
        InterfaceClass8.Sample4 j=in.new Sample4();
        j.pack();
    }
}
