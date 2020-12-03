package Interface;

interface Demo{
    void dispaly();
}
class DemoClass implements Demo{
    public void dispaly(){
        System.out.println("Displaying method");
    }
}
public class InterfaceExcercise8 {
    public static void main(String[] args) {
        DemoClass d= new DemoClass();
        d.dispaly(); 
    }
}
