public class method2 {
    //void without parameters
    public void add(){
        int a =30;
        int b=15;
        System.out.println(a+b);
    }
    //int without parameters
    public int sub(){
        int a=20;
        int b=15;
        return a-b;

    }
    //static without parameters
     static void add1(){
        int a =12;
        int b=20;
        System.out.println(a+b);
    }
    static int sub1(){
        int a=10;
        int b=12;
        return a-b;

    }
   
    public static void main(String args[])
    {
        add1();
        int d = sub1();
        System.out.println(d);
        method2 m= new method2();
        m.add();
        int c=m.sub();
        System.out.println(c);
    
        
    }
    
}
