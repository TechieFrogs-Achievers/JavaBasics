package Assignment4;
class Test{
    //method to print different data types
    public void printn(int i,char c){
        System.out.println(i + " " + c);
    }
    //same methd to print intechanging the data types
    public void  printn(char c,int i){
        System.out.println(c+" "+i);
    }
}
public class MethodExcercise2 {
    public static void main(String[] args) {
      Test t = new Test();
      //calling the methods by its objects
      t.printn('R', 4);
      t.printn(2, 'S');
    }
}
