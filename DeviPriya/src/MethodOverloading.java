public class MethodOverloading{
    public int div(int a , int b){
             return (a / b); }
     
    public int div(int a , int b , int c){
             return ((a + b ) / c); }
     
    public static void main(String args[]){
        MethodOverloading m=new MethodOverloading();
   System.out.println(m.div(10 , 2));
   System.out.println( m.div(10, 2 , 3));
    }
    }