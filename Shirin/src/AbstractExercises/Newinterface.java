package AbstractExercises;
import InterfaceExercise.NewPack;
public class Newinterface
{
    protected class Nestedclass implements NewPack   
    {
         public Nestedclass()
        {

        }
        public void demo()
        {
            System.out.println("Nestedclass in 2nd package");
        }
         public void Pack()
        {
           System.out.println(" interface method");
        }
    }
    
}
