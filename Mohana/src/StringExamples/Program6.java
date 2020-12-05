package StringExamples;

public class Program6 
{
    public static void main(String[] args) 
    {  
        //here it checks the values 
        String s1 = "Mohana";
        String s2 = "Mohana";
        String s3 = "Techie";
        System.out.println(s1.equals(s2));//true because both values are same 

        //creating new strings
        String str1 = new String("Techie");
        String str2 = new String("Techie");
        System.out.println(str1.equals(str2));//true
        System.out.println(s3.equals(str2));//true

    }
    
}
