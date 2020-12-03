package Interfce;
interface Sample
{
    final String s ="jemi"; //final data member
    static int a=5; //static data member
     double k=13232.25f; //default datamember

}

public class InterfaceExercise4 
{
    public static void main(String[] args) 
    {
        String s = "Bandaru"; //local datamember
        System.out.println(Sample.a); //calling static datamember by using interfacename
        System.out.println(Sample.s); //calling final datamember by using interfacename
        System.out.println(Sample.k);
        //System.out.println(a); 
        //System.out.println(k);
        System.out.println(s); //calling local variable
        //System.out.println(Sample.s);

        
    }
    
}
