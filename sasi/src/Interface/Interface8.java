package Interface;
interface Packagepack // interface class 
{
    void pack(); // method for interface
}
 public class Interface8 {
     public class InterfaceExtend implements Packagepack // inner class
     {
         public void pack() // method for inner class
         {
             System.out.println(" this is our package");
         }
     }

     // public static void main(String[] args) {
     public static void main(String[] args) {
         Interface8 i = new Interface8();
         Interface8.InterfaceExtend j = i.new InterfaceExtend();
    j.pack(); 
}
}


    

