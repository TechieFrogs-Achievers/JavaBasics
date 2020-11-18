class Types
{
    int s;
    public void Demo()
    {
        int a=78;
        int b=98;
        s=a+b;
        System.out.println(s); //176
    }
    public void Demo(int x , int y)
    {
        s=x*y;
        System.out.println(s); //30
    }
    public int Demo1()
    {
        int c=25;
        int d=5;
        return c%d; //0
    }
    public int  Demo2(int q ,int r)
    {
        s=q-r;
        return s;
    }

}
public class Methods 
{
    public static void main(String[] args)
     {
         
         Types t = new Types();
         t.Demo();
         t.Demo(5,6);
         int l=t.Demo1();
         int m= t.Demo2(100,26);
         System.out.println(l); 
         System.out.println(m); //74

         
        
    }
}
    
