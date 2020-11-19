public class IfElse 
{
    //main method
    public static void main(String[] args)
    {
       int num=1234;
       String name="example";
       double big=10000052d;
       float decimal=12.458f;
       //if block
       if (((num>=big) & (decimal!=big)) || (name!="example"))//(((f)&(t)) || (f))=((f)||(f))=flase
       {
          System.out.println("given codition is true");
       }
       else
       {
        System.out.println("given codition is flase");
       }
    
    // another ifElse method
      {
        if (((num<=big) | (decimal!=big)) && (name!="example"))//(((t)|(t)) && (f))=((t)&&(f))=flase
        {
           System.out.println("given codition is true");
        }
        else
        {
         System.out.println("given codition is flase");
        }
    //ternary operator
       String result=(name=="exam")? name:"not found";//false print not found
       System.out.print("result is:"+result);
    }
    
}
}
