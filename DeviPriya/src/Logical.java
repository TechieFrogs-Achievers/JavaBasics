public class Logical {
    public static void main(String args[]) {
        int a=4;  
int b=6;  
int c=8;  
System.out.println(a<b&&a<c);   //true&& true = true  
System.out.println(a<b&&a++<c); //true && true = true 
System.out.println(a);          //5 because second condition is not checked  
System.out.println(a>b||a<c);   //false || true = true
System.out.println(a>b||a++<c); //false || true = true  


        
    }
    
}
