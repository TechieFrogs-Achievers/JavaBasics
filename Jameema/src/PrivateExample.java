class Sample2
{
    int num1;
    int num2;
    private void addition(int a,int b)
    {
        int c=a+b;
        System.out.println(" the addition of num" +c);
        
    }
    Sample2(int a, int b)
    {
        int c=a-b;
        System.out.println("the sub of two num:" +c);
    }
}
public class PrivateExample 
 {
     public static void main(String[] args) 
     {
        Sample2 s = new Sample2(4,5);
        //s.addition(9,8);
       
         
     }
    
}
