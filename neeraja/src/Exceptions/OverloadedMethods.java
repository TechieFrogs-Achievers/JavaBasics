package Exceptions;

class OverloadedMethods{
        //overloaded method one
        double method(int i) throws Exception {
            return i / 0;
        }
        //overloaded method two
        boolean method(boolean b) {
            return !b;
        }
        //overloaded method three
        static double method(int x, double y) throws Exception {
            return x + y;
        }
        //overloaded method four
        static double method(double x, double y) {
            return x + y - 3;
        }
    
        //driver code
 public static void main(String[] args) {
            //instantiation of class
            OverloadedMethods mn = new OverloadedMethods();
            //user defined exception handler
            try {
                System.out.println(method(10, 20.0));
                System.out.println(method(10.0, 20));
                System.out.println(method(10.0, 20.0));
                System.out.println(mn.method(10));
            } catch (Exception ex) {
                System.out.println("exception occoure: " + ex);
         
        }
    
    }   
}

