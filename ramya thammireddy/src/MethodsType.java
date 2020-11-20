public class MethodsType 
{
    int s;
    public void Demo()
    {
        int a=78;
        int b=98;
        s=a+b;
        System.out.println(s);
    }
    public void Demo(int x , int y)
    {
        s=x*y;
        System.out.println(s);
    }
    public int Demo1()
    {
        int c=25;
        int d=5;
        return c/d;
    }
    public int Demo2(int q , int r)
    {
        s=q%r;
         return s;
    }
    
}
     public class MethodsType
{
    public static void main(string args[])
    {
        MethodsType t = new MethodsType();
        t.Demo();
        t.Demo(5,6);
        int l=t.Demo1();
        System.out.println(l);
    } 
}