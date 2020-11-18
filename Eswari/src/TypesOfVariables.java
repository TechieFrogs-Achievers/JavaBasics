public class TypesOfVariables {
    int instanceVal=450;  //Instance variable
    static int m=12;
     //System.out.println(instanceVal);
     void method()
     {
         int methodVal=45;
         System.out.println(methodVal);  //local variable
         //System.out.println(localVal);
     }
    
    public static void main(String args[]) {
        int localVal = 50;  //local variable
        //int m=10;
        System.out.println(localVal);
        System.out.println(m);
        TypesOfVariables tv= new TypesOfVariables();
        tv.method();
        System.out.println(tv.instanceVal);

        //System.out.println(methodVal);
    }
    
}
