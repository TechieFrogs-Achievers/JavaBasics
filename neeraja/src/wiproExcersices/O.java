
import java.util.Scanner;
public class O{
    public static void main(String[] k){
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       String result=" ";
       for(int i=0;i<s1.length();i++){
         if(s1.charAt(i)>='a' || s1.charAt(i)>='z'){
             result=result+ Character.toUpperCase(s1.charAt(i));
         }
         if(s1.charAt(i)>='A' || s1.charAt(i)>='Z'){
            result=result+ Character.toLowerCase(s1.charAt(i));
        }
      
       }
       System.out.println(result);
    }
}
