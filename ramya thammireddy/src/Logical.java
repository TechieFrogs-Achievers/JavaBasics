public class Logical {
    

        public static void main(String args[]){
        
        int a=20;
        
        int b=10;
        
        int c=30;
        
        System.out.println(a>b||a<c);//true || true = true
        
        System.out.println(a>b|a<c);//true | true = true
        
        
        System.out.println(a>b||a++<c);//true || true = true
        
        System.out.println(a);//20 because second condition is not checked
        
        System.out.println(a>b|a++<c);//true | true = true
        
        System.out.println(a);//21 because second condition is checked
        
        
    }
    
}
