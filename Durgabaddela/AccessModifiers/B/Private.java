package B;
public class Private
{
    private int num = 100;

    //protectd method

    private void display() 
    {
        System.out.println(num);
     }
}

  public  class Example  {
    public static void main(String[] args) {
        Private p = new Private();

        //accessing the private method

        p.display();
  }
}
