class modifier{
    //different methods with different return types
    public void read()
    {
        //with void return type
        System.out.println("public method");
    }
    public int show(int x) {
        //method with int return type
        System.out.println("private method");
        return x;
    }
}
public class AccessModifier1 {
    public static void main(String[] args) {

        modifier m = new modifier();
        m.read();
        System.out.println(m.show(5));//it will print 5
    }
}
