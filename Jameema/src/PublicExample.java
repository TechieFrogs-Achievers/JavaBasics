class Sample1
{
    int num1;
    int num2;
    public void addition(int a,int b)
    {
        int c=a+b;
        System.out.println(" the addition of num" +c);
        
    }
    Sample1(int a, int b)
    {
        int c=a-b;
        System.out.println("the sub of two num:" +c);
    }
    

}
public class PublicExample 
{
    public static void main(String[] args)
     {
         Sample1 s = new Sample1(4,5);
         s.addition(9,8);
        
    }
    
}
