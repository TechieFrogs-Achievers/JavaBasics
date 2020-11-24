public class MethodProgram7 
{
  public static void main(String[] args) 
  {
    J j1=new J();//create object
    System.out.println(j1.i=8);//assign values
    j1.j=4;//assign values
    j1.printNUm(); //calling method 
  }  
}
class I 
{
    int i;
    //method for print i value
    public void printNUm()
    {
        System.out.println("I value is:"+i);
    }
}
class J extends I 
{
    int j;
    //method for print j value
    public void printNUm()
    {
        System.out.println("J value is:"+j);
    }
}