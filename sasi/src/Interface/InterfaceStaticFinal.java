package Interface;
interface Static1 // interface class 
{
    static int value=2; // static variable
    //int value=2;
   final int val=6;   // final varible
   //int val=6; 
}
public class InterfaceStaticFinal implements Static1 { // class implemts interface
    public static void main(String[] args) {
        System.out.println("valueis:"+value);
        System.out.println("value is :"+val);
    }
}
