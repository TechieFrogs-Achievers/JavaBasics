class Vehicle  //overloading
{ 
  //  String color;
    //float price ;
    void show( float price, String color) //method with arguments 
    {

        System.err.println("properties:"+color+" "+price);
    }
    void show ( float price,String color, String model) //method with  diffrent argumnts 
    {
        System.out.println("properties:"+color+" "+price+" "+model);
    }
}
class VehicleMethodOverloding
{
    public static void main(String[] args)
     {
         Vehicle m=new Vehicle(); //object creation for class 
         m.show(50000f,"red"); //calling method with object from  class method
         m.show(50000f,"black","fz"); //calling method with object from  class method
     }
    }
