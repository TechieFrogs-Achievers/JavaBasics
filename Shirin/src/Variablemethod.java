public class Variablemethod {
    int data=30;
    static int value=50;
    void method ()
    {
        int sum=80;
        System.out.println(sum);
    }
        public static void main(String[] args) {
            System.out.println(value); 
            Variablemethod m=new Variablemethod();
            System.out.println(m.data);
            m.method();

            
        }
    
}
