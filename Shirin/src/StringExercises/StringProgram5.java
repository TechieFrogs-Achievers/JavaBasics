package StringExercises;

public class StringProgram5 
{


     // string using == & string using object ==
    public static void main(String[] args) 
    {
        // data type
         String s1 = "Shirin";
         String s2 = "Shirin";
         String s3 = new String("Shirin");
         String s4 = new String ("Shirin");// it creates new instance
         System.out.println(s1==s2);//true
         System.out.println(s1==s3);//false
         System.out.println(s3==s4); // false
        
    }
    
}
