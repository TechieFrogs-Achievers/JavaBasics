package Assignment4;
//method overload with different types of parameters
class DispalyOverload{
    //method for printing char data type
    public void show(char c){
        System.out.println(c);
    }
    //method for integer data type
    public void show(int i){
        System.out.println(i);
    }
}
public class MethodOverLoading2 {
    public static void main(String[] args) {
        DispalyOverload d= new DispalyOverload();
        d.show('s'); //s
        //method overloading is done here with different types of 
        //parameters
    }
}
