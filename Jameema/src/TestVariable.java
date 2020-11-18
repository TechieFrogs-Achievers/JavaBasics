public class TestVariable
 {
    int data=50;
    static int value=35;
    public static void main(String[] args) 
    {
        int var=40;
        System.out.println(var);
       System.out.println(value);
        TestVariable v = new TestVariable();
        System.out.println(v.data);
    } 
}
