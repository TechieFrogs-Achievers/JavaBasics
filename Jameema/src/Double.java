 class VariableMethod
{
    int val=456;
    static int num=6787;
    void Demo()
    {
        int a=45;
        int b=35;
        int c=a+b;
        System.out.println(c);
    }
}
public class Double extends VariableMethod
 {
     public static void main(String[] args)
      {
         int cal=894;
         System.out.println(cal);
         System.out.println(num);
         VariableMethod t = new VariableMethod();
         t.Demo();
         System.out.println(t.val);
     }   
}
