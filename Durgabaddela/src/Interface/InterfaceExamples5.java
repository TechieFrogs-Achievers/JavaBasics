package Interface;
interface Demo1//first interface
{
   void print1(String s);//abstract method1
   void print2(int x, int y);//abstract method2
}
interface Demo2//second interface
{
   public void show1(int x, int y);//abstract method1 in second interface
   public void show2(char c);//abstract method1 in second interface
}
interface Demo3//third interface
{
    public void display1(char c ,char ch);//abstract method1 in third  interface
    public void display2(int a, int b);//abstract method1 in third interface
}
//new interface extends three interfaces

interface Demo extends Demo1,Demo2,Demo3
{
    abstract String visible();
}
//class implements  new inteface
class Myclass implements Demo
{
   public  void print1(String s)//implementation of first method in 1st interface
    {
        System.out.println(s);
    }
    @Override
    public void print2(int x, int y)//implementation of second method in 1st interface
    {
        System.out.println(x+y);
    }
    @Override
    public void show1(int x, int y)//implementation of first method in 2nd interface
    {
        System.out.println(x*y);
    }
    public void show2(char c)//implementation of second method in 2nd interface
    {
        System.out.println(c);
    }
    public void display1(char c ,char ch)//implementation of first method in 3rd interface
    {
        System.out.println(c+ch);
    }
    public void display2(int i, int j) //implementation of second method in 3rd interface
    {
        System.out.println(i - j);
    }
    public String visible()//override method in new interface
    {
        return ("im final method for class");
    }
}
public class InterfaceExamples5
{
     public static void main(String[] args) 
     {
         Myclass m = new Myclass();//creating object for myclass
         m.print1("Hai this is first method");
         m.print2(23,43);
         m.show1(232, 32);
         m.show2('d');
         m.display1('k', 'l');
         m.display2(12,34);
         m.visible();
     }
    
}
