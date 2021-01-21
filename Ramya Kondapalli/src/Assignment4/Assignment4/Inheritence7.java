package Assignment4;
//creating counter class
class Counter1 {
    int i;
    void increment(int j){
        i=j;
        System.out.println("i = " + i);
    }
}
class Counter2 extends Counter1{
    void increment(){   //over riding method
    super.increment(3);   //calling the method in parent class
    }
}
public class Inheritence7 {
    public static void main(String[] args) {
    Counter2 c2 = new Counter2();
    //calling the method in 2nd class through object 
    c2.increment();
    }
}
