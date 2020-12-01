public class OperatorOverloading 
{
    //operator overloading 
    public void sum(int a,int b)
    {
        System.out.println("sum="+(a+b));
    }
    public void sum(String x,String y)
    {
        System.out.println("sum="+(x+y));
    }
    //method overloading
    public void sum(int a,String s)
    {
        System.out.println(a+s);
    }
    public void sum(String s,int a)
    {
        System.out.println(s+a);
    }
    
   // public void sum(char c,String s)
    //{
      //  System.out.println(c+s);
    //}
  
        public static void main(String[] args) 
    {
        OperatorOverloading op=new OperatorOverloading();//object creation
        //assign values
        op.sum(4, 4);//
        op.sum("anu", "jakkam");
        op.sum(4, "anusha");
        op.sum("hello", 5);
       // op.sum('j', "anusha");
    }
}
