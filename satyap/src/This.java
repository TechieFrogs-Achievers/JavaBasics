public class This {
    int rno=60;
        String name="satya";
        float fee=50000;
    This(){
        
        System.out.println(rno+" "+name+" "+fee);
        
    }
    This(int r){
        
        this();
        rno=r;
        
        System.out.println("Default constructors");
    }
    This(String name,float fee){
        this(60);
        System.out.println("Parameterised constructors");
    }
    public static void main(String[] args) {
        This s=new This();
        This s1=new This(60);
        
        
    }
    
}
