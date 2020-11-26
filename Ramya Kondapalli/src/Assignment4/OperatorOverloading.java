package Assignment4;
class OperatorTest{
    public void show(int a,int b){
        System.out.println(a+b);
    }
    public void show(String s1,String s2){
        System.out.println(s1+s2);
    }
    public void show(int a,String s){
        System.out.println(a+s);
    }
    public void show(char c,String s){
        System.out.println(c+s);
    }
}
public class OperatorOverloading {
    public static void main(String[] args) {
        OperatorTest o = new OperatorTest();
        o.show(2, 6);
        o.show("Hi ", "Ramya");
        o.show(420, " Smiley");
        o.show('K', " Ramya");
    }
}
