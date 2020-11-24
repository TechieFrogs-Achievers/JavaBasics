package Assignment4;
//creating counter class
class Counter1{
    int i;
    void increment(int j){
        i=j;
        System.out.println(i);
    }
}
class Counter2 extends Counter1{
    void increment(){   //over riding method
    this.increment(3);   //calling the method in parent class
    }
}
public class Inheritence7 {
    public static void main(String[] args) {
    Counter1 c1 = new Counter1();
    c1.i = 3; //intialising the data member through object 
    System.out.println("i = " + c1.i);
    }
}
