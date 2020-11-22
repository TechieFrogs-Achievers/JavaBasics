class Sample3
{
    int num1;
    int num2;
    protected void addition(int a,int b)
    {
        int c=a+b;
        System.out.println(" the addition of num" +c);
        
    }
    Sample3(int a, int b)
    {
        int c=a-b;
        System.out.println("the sub of two num:" +c);
    }

}
public class ProtectedExample 
{
    public static void main(String[] args)
     {
        Sample3 s = new Sample3(4,5);
        s.addition(9,8);
       
        
    }
    
}
