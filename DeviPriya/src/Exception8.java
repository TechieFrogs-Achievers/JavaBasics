public class Exception8 {
    double method(int i) throws Exception {
        return i/0;
     }
     
     static double method(int x, double y) throws Exception { //same method name with
                                                                //deiffernt parameters
        return x + y ;
     }
     static double method(double x, double y) { //method overloading
        return x + y - 3;
     }   
     public static void main(String[] args) {
        Exception8 mn = new Exception8(); //creating object for class
        try {
           System.out.println(method(10, 20.0)); // calling method
           System.out.println(method(10.0, 20));
           System.out.println(mn.method(10));
        } catch (Exception ex) {
           System.out.println("exception occoure: "+ ex);
        }
     }
    
}
