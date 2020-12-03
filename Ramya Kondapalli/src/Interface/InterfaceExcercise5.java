package Interface;

//creating interface FastFood
interface FastFood{
    //abstract methods
    void  noodels();
    void biryani();
}

//class implementing interface
class Sandwich implements FastFood{

    //implemntation for abstarct methods
    public void noodels(){
        System.out.println("Your order is Noodels");
    }

    public void biryani() {
        System.out.println("Your order is Biryani");
    }
}
public class InterfaceExcercise5 {
    public static void main(String[] args) {
        //creating object for class
        Sandwich s = new Sandwich();
        s.noodels();
        s.biryani();
    }
}
