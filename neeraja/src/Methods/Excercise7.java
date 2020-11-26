package Methods;

class Integer{    //parent class
    int i;
    void printNum(){ 
        System.out.println(i);
    }
}
class Integer1 extends Integer{ //child class
    int j;
    //overriding parent class publc method
    void printNum(){
        System.out.println(i);
        System.out.println(j);
    }
}
public class Excercise7 {
    public static void main(String[] args) {
        //child class instantiation
        Integer1 obj2 = new Integer1();
        obj2.i=3;
        obj2.j=4;
        //it will call child class method
        obj2.printNum();
    }
}
