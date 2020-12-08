package StringExercises;

 import java.util.*;
public class Rough2 
{
    public static void main(String[] args)
    {
        //String s1 = "mounika";
        //String s2 = "shirin";
       StringBuffer  s =  new StringBuffer("mounika");
       // System.out.println(s.capacity());
       // s.append("shirin");
       // s.insert(3,"shirin");
        //s.replace(1, 4, "shirin");
        //s.delete(0, 4);
        //s.reverse();
        //s = new StringBuffer(" ");
        s.ensureCapacity(10);
        System.out.println(s.capacity());
        
    }
}

    