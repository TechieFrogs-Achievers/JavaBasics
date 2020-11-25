class Dress  //parent class 
{
    void show(float price,String model,String color) //method for poarent class
    {
        System.out.println("Dresses:"+"price"+price+"        "+"model:"+model+"      "+"color:"+color);
    }
}
class Amazon extends Dress  //child class inherites the properties from parent 
{
    void  show(float price,String model,String color) // child class method
    {
        System.out.println("Amazon womens clothing purchased item:"+"price"+price +"           "+"model:"+model+"           "+"color:"+color);
    }
}
class ClothingMethodOverriding 
{
    public static void main(String[] args)
     {
        Amazon a=new Amazon(); // object created for child class 
        a.show(5000,"punjabi","black"); // calling the child method with child object
    }
}
