public class IfElsePractice1 {
    public void ifElseExample()
    {
        int a=87;
        if ((a>=0) && (a%2 == 0) || (a%4 == 0))
        System.out.println("even");
        else
        System.out.println("odd");
    }
    public static void main(String args[])
    {
        IfElsePractice1 obj = new IfElsePractice1();
        obj.ifElseExample();
    }
}

