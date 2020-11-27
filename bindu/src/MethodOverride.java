class Flowers    //super class
{
    //String plant
    //String Flowers
    public void Flowers()   //method creation 
    {
        System.out.println("This flower belows to that plant:"); //prints the parent class
    }
}
class plant extends Flowers     //subclass inherits the parent class 
{
   public void Flowers()
   {
       super.Flowers();           //super to call the parent class
       System.out.println("This is a plant:");
   } 
}
class MethodOverride
{
    public static void main(String[] args) 
    {
        plant p = new plant();    //creating object for the child class
        p.Flowers();
    }
}
