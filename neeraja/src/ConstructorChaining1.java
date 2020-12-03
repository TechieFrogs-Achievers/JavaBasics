public class ConstructorChaining1
 {

    //constructor two
    ConstructorChaining1()
    {
        this("neeraja");
        String name="TECHIFROGS";
        System.out.println(name);
    }

    //constructor one
    private ConstructorChaining1(int x, int y)
    {
        this();
        System.out.println(x*y);

    }

    //constructor three
    public ConstructorChaining1(String string)
    {
        System.out.println(string);
    }


    public static void main(String[] hn)
     {
         //reation of object
          ConstructorChaining1 construct =new ConstructorChaining1(1,56);
     }

 }

    

