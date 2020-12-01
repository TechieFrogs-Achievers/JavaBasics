package Assignment4;
//method over loading with different number of parameters
class DisplayOverloading{
    //method with single parameter
    public void show(int i){
        System.out.println(i);
    }
    //method with two parameters
    public void show(int i,char c){
        System.out.println(i+c); //86
        //here char is promoted to int 
        //value os 'S' is 83 and 3 is added to 83
    }
}
public class MethodOverLoading1 {
    public static void main(String[] args) {
        DisplayOverloading d = new DisplayOverloading();
        //overloading will happen due to differnt number of arguments
        d.show(3,'S');
    }
}
