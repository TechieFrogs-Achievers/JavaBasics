public class Variables {
    int sample_var1=100;        
    static int  sample_var2=40; 
        public static void main(String args[]) {
        int sample_var3=50 ;
        System.out.println("instance variable is:" +sample_var3);
        System.out.println("static variable is:" +sample_var2);
        Variables v= new Variables();
        System.out.println("local variable is:" +v.sample_var1);

        
        
    }
    
}
