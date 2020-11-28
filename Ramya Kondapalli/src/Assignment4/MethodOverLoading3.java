package Assignment4;
//method overloading with interchanging of parameters and data types
class DisplayOverload{

    //methods with interchanging parameters
    public void show(int i, float f){
        System.out.println(i+f);
    }
    public void show(float f,int i){
        System.out.println(f+i);
    }
}
public class MethodOverLoading3 {
    public static void main(String[] args) {
        DisplayOverload d = new DisplayOverload();
        d.show(2.3f, 6);
        //Here method overloading is done by the interchangble paremeters 
    }
}
