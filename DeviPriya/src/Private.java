
    public class Private
{
    private int value=20;
    //using priavte modifier
    private void display()
    {
        System.out.println(" private access modifire");
    }
   public static void main(String[] args) 
   {
      Private p=new Private();//object creation
      p.display(); //method calling
      System.out.println(p.value);//display the value
   } 
} 
    

