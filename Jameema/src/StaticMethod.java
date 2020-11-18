class Basic
{
    static int z;
    public static void Demo()
    {
        int j=10;
        int k=5;
        z=j-k;
        System.out.println(z); //5
    }
    public static int Demo1() 
    {
        int a=8;
        int b=10;
        z=a*b;
        return z;
    }
    public static void Demo2(int x, int y)
    {
        z=x+y;
        System.out.println(z); //133
    }
    public static int Demo3(int g , int h)
    {
        z=g%h;
        return z;

    }

}
public class StaticMethod extends Basic
 {
     public static void main(String[] args) 
     {
         Demo();
         Demo1();
         System.out.println(z); //80
         Demo2(35,98);
         Demo3(36,6);
         System.out.println(z);//0
     }
        
}
