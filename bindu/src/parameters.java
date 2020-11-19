public class parameters {
    //int return type with parameters
    public int add( int x,int y)
    {
        return x+y;

    }
    //void return type with parameters
     public static void mul(int a,int b) 
     {
         int c= a*b;
         System.out.println("mul of two numbers is:" +c);
    
    }
    //static return type with parameters
    public static void sub(int c,int d)
    {
        int p = c-d;
        System.out.println("sub of two numbers is:" +p);    
    }
    public static int subtraction(int g, int f)
    {
        return g-f;

    }
    public static void main(String args[]){
        parameters p = new parameters();
        int s=p.add(10,20);
        System.out.println(s);
        p.mul(5,7);//void return type calling
        p.sub(20,12);//static void return type calling
        
        
    
        

    }


}
