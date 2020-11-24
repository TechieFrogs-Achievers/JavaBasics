package Assignment4;

class PrintNumber
{
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
public class DataTypes1 {
    public static void main(String[] args) {
    PrintNumber p = new PrintNumber();
    p.printn(5);
    p.printn(3.5f);
    p.printn('s');
    p.printn("Ramya");
    p.printn(true);
    }
}
