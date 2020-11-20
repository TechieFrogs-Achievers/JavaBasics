public class varmethod {
    int val=64;
    static int Num=75;
    void techie()
    {
        int var=100;
        System.out.println(var);
    }
    public static void main(String[] args) {
        System.out.println(Num);
        varmethod v =new varmethod();
        System.out.println(v.val);
        v.techie();

        
        
    } 
    
}
