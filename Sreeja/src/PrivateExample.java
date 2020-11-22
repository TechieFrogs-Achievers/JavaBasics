public class PrivateExample
 {
    private String name = "sreeja";
    private int num =  57;

    private void display()
    {
        System.out.println("Name:"+name+" "+"Number:"+num);
    }
    
    public static void main(String[] args)
     {
            PrivateExample pt = new PrivateExample();
            pt.display();
    }


}
