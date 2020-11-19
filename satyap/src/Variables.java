public class Variables {
    
    int num=60;
    static int value=50;
    void method(){
        int var=10;
        System.out.println(var);
    }
    public static void main(String args[]){
    
        Variables v=new Variables();
        v.method();
        System.out.println(v.num);
        System.out.println(value);

    }
    
    
}
