package Assignment4;

class PrintNumber
{
    //same methods to print different data types
    public void printn(int i){
        System.out.println("Integer data type :" + i);
    }
    public void printn(float f){
        System.out.println("Float data type :" + f);
    }
    public void printn(char c){
        System.out.println("Char data type :" + c);
    }
    public void printn(String s){
        System.out.println("String data type :" + s);
    }
    public void printn(boolean b){
        System.out.println("Boolean data type :"+ b);
    }
}
public class MethodExcersice1 {
    public static void main(String[] args) {
    PrintNumber p = new PrintNumber();
    //calling the methods with objects
    //compiler checks the method according to type of data(argument)
    p.printn(5);
    p.printn(3.5f);
    p.printn('s');
    p.printn("Ramya");
    p.printn(true);
    }
}
