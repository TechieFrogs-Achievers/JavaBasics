package AbstractionExamples; 
import InterfaceExamples.Program3;

public class InterfaceP3  implements Program3
{
       public void attentendence()
      {
           System.out.println("iam from another package");
      }
      public void stdDetails()
     {
           System.out.println("method from another class");
     }
      public void fcultilyDetails()
      {
            System.out.println("interfaces are public");
      } 

      public static void main(String[] args) 
      {

        InterfaceP3 in = new InterfaceP3();
        in.attentendence();
        in.stdDetails();
        in.fcultilyDetails();
          
      }
}
