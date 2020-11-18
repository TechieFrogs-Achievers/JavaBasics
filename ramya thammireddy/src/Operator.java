public class Operator {
    

        public static void main(String args[]){
        
        int a=20;
        
        int b=5;
        
        int c=30;
        
        System.out.println(a<b&&a++<c);//false && true = false
        
        System.out.println(a);//20 because second condition is not checked
        
        System.out.println(a<b&a++<c);//false && true = false
        
        System.out.println(a);//21 because second condition is checked
        
        
    }
    
}
