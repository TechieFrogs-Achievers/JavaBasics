package Methods;

//class printNumber
class PrintNumber
{
    //same methods to print int data type
    public void printn(int i){
        System.out.println("Integer data type :" + i);
    }
    //same methods to print float data type
    public void printn(float f){
        System.out.println("Float data type   :" + f);
    }
    //same methods to print char data type
    public void printn(char c){
        System.out.println("Char data type    :" + c);
    }
    //same methods to print String data type
    public void printn(String s){
        System.out.println("String data       :" + s);
    }
    //same methods to print boolean data type
    public void printn(boolean b){
        System.out.println("Boolean data type :"+ b);
    }
}


public class Excercise1 
{
    public static void main(String[] args)
    {
        //creating instace of class primenumber
        PrintNumber p = new PrintNumber();
        //calling the methods with objects
        //compiler checks the method according to type of data(argument)
        p.printn(5);
        p.printn(8.5f);
        p.printn('b');
        p.printn("neeraja");
        p.printn(true);
        }
    
}
