package AbstractionExamples;

public class Packageex1 
{  
    public void function()
    {
        System.out.println("iam from another package");
    }
    public static void main(String[] args) 
    {
         Packageex1 ex1 = new Packageex1();
         ex1.function();
    }
    
}
