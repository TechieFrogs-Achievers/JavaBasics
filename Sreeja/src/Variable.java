public class Variable {
      float firstValue=5.44f;
    static byte a=20;
    public void values()
    {
      int secondValue=34;
      System.out.println(secondValue);
    
    }
      public static void main(String[] args) {
        Variable obj=new Variable();
        obj.values();
        System.out.println(obj.firstValue);
          System.out.println(a); 
        
      }  
}
