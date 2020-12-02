package interfaces;

//creating an interface
interface T{
    //declaretion and initialization of static final variables
    int x=30;
    double y=20.968585;
     void add();
}

public class Sample5 implements T {
    //implementation of abstract method
    public  void add()
          {
              System.out.println("inside iplementation method ");
          }
    public static void main(String[] hv){
          
          //T.x=43;
          System.out.println("value of x is:"+T.x);
    }
    
}
