
public class PrivateExample 
{
    private int value=20;
    //using priavte modifier
    private void display()
    {
        System.out.println(" private access modifire");
    }
   public static void main(String[] args) 
   {
      PrivateExample p=new PrivateExample();//object creation
      p.display(); //method calling
      System.out.println(p.value);//display the value
   } 
} 
