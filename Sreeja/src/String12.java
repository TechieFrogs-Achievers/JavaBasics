import java.util.*;
public class String12 
{
     public static void main(String[] args) 
     {
        StringBuffer sb = new StringBuffer();       //creating string buffer object 
        
        

        Scanner sc = new Scanner(System.in);        //creating scanner object     

        System.out.println("Enter 4 strings");
        
        //adding the strings to the string buffer
        //read the strings from the user

        sb.append(sc.next());
        sb.append(sc.next());
        sb.append(sc.next());
        sb.append(sc.next());

        System.out.println("String buffer is:  "+sb);

        sb.delete(0,sb.length());       //string buffer delete method to clear the string buffer
        System.out.println("StringBuffer is:"+sb);

        sc.close();
    }
    
}
