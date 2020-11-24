public class Method2 
{
    void getMethod(int n,char c) //  method overloading 
    {
       System.out.println("Number:"+n+" "+"character"+" "+c);
    }
    void getMethod(char c,int n)
    {
        System.out.println("character:"+c+" "+"Number:"+n);
    }
    public static void main(String[] args) {
        Method2 m2=new Method2(); // obj creation for method2
        m2.getMethod(1,'A'); // method calling getMethod(int,char)
        m2.getMethod('B',2); // method calling getMethod(char,int)
    }
}
