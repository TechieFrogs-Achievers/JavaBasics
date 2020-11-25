
public class Private
{
    private int num = 100;

    //private method

    private void display() 
    {
        System.out.println(num);
     }
}

 class Example {
    public static void main(String[] args) {
        Private p = new Private();

        //calling the private method

        //p.display();
  }
}
