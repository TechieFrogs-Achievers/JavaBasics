package Test;

import Interface.InterfaceExcercise7;

class innerClass implements InterfaceExcercise7 {

    public void oneMethod() {
        System.out.println("One method");
    }
    
}
public class Interface7 {
    public static void main(String[] args) {
        innerClass i = new innerClass();
        i.oneMethod();
    }
}
