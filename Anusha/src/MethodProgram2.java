
public class MethodProgram2 
{
    //create non-static method for print int,char values
    public void charInt(char c,int n)
    {
        System.out.println(c);
        System.out.println(n);
    }
    //create static method for print int,char values
    public static void intChar(int n1,char c1)
    {
        System.out.println(c1);
        System.out.println(n1);
    }
   public static void main(String[] args) 
   {
      MethodProgram2 m2=new MethodProgram2();//create object
      m2.charInt('a', 123); //assign values for non-static method by using reference object of a class
      MethodProgram2.intChar(456,'b');//assign values for static method by using  class name
     
    } 
}
