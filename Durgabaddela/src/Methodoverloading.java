class DisplayOverloading
{
    //overloading by chainging the number of arguments

 public void display(int n)
 {
     System.out.println("the value of n is "+n);
 }
 public void display(int n, char c)//override method
 {
     System.out.println("the value of n and c are  "+n+" "+c);
 }
//method overloading by chainging the type of arguments

public void Product(int i,int j )
{
    System.out.println("product is"+" " +(i*j));
}
public void Product(double i, double j)//override method
{
    System.out.println("product is"+" "+(i*j)); 
}
//method overloading by chainging the sequence of arguments

public double show(int i,double j )
{
    return (i-j);
}
public double show(double j, int i)//override method
{
    return (i-j);
}

}
 class MethodOverloading 
{
    public static void main(String[] args)
    {   //creating the object for instance class

        DisplayOverloading obj = new DisplayOverloading();
        obj.display(1234);//calling the method 
        obj.display(232, 'd');//calling the override method
        obj.Product(34,54);
        obj.Product(56.8,78);//calling the override method with diff type arguments
        obj.show(234,56.7);
        obj.show(564.89,567);//calling the override method with  diff sequence of arguments

    }
}
