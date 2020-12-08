package StringExamples;

import java.util.Scanner;

public class StringBufferEx3 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String str = sc.nextLine(); 
        sb.append(str); 
        System.out.println(str);
        System.out.println(sb.capacity()); //it gives the capacity 
        sb.append("java is a very simple and easy language");
        System.out.println(sb);
        System.out.println(sb.capacity());//here the capacity automatically changes
        sb.ensureCapacity(60); //it increases the capacity value
        System.out.println(sb.capacity());
        
        sc.close();
        
    }
    
}
