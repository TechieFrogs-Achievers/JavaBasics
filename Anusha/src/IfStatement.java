public class IfStatement 
{
        //main method
    public static void main(String[] args)
    {
        System.out.println("Main Method:");
        IfStatement is=new IfStatement();
        is.ifExample1();
        is.ifExample2();
    }
    //ifExample1 method
    public void ifExample1()
    {
        String language="java";
        char letter='a';
        if(language=="java" && letter=='a')//true && true= condition is true
        {
         System.out.println("java is best programming language");
        }
    }
    //ifExample2 method
    public void ifExample2()
    {
        float value=1.22124f;
        int val=12;
        if(value==2.3f || val==13)//false || false=condition is false   
        {
            System.out.println("floating value is:"+value);
        }
    }
}
