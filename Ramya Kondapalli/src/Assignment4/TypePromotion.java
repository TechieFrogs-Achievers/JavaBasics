package Assignment4;
//method overloading with type promotion
class DispalyOverLoad1{
    //methods with parametrs for types promotion
    public void show(int i,double d){
        System.out.println(i+d);
    }
    public void show(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class TypePromotion {
    public static void main(String[] args) {
        DispalyOverLoad1 d = new DispalyOverLoad1();
        d.show(3,4.11f); 
        //type promotions is happend
        //float is promoted to double
    }
}
