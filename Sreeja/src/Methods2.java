class MethodEx2
{
    int integer;
    char character;

    //method overloading
    
    public void insert(int x, char y)       //method to initialize the values with different datatypes
    {
        integer = x;
        character = y;
        System.out.println(character+" "+integer);
    }

    public void insert(char x,int y)        //method to initialize the values with different datatypes and different order
    {
        character = x;
        integer = y;

        System.out.println(integer+" "+character);
    }
    
}

public class Methods2
 {
 public static void main(String[] args)
  {
        MethodEx2 m = new MethodEx2();      //object creation

            m.insert(2,'s');        //method calling with object
            m.insert('e', 3);       //method calling
    }
}
