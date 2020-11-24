class modifier{
    public void read()
    {
        System.out.println("public method");
    }
    public int show(int x) {
        System.out.println("private method");
        return x;
    }
}
public class AccessModifiers1 {
    public static void main(String[] args) {

        modifier m = new modifier();
        m.read();
        System.out.println(m.show(5));
    }

    
}
