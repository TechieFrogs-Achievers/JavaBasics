package Assignment4;
class Test{
    public void printn(int i,char c){
        System.out.println(i + " " + c);
    }
    public void  printn(char c,int i){
        System.out.println(c+" "+i);
    }
}
public class DataTypes2 {
    public static void main(String[] args) {
      Test t = new Test();
      
      t.printn('R', 4);
      t.printn(2, 'S');
    }
}
