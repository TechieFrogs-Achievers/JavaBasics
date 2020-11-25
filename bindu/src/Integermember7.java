class i
{
    int i;   //integer data member
    void printNum()   //creating the method to print the integer number i
    {
        System.out.println(i);
    }
}
class j extends i   //childclass extends the parent class
{
    int j;
    void printNum()    //creating the method to print the value of j
    {
        System.out.println(j);
    }
}
public class Integermember7 
{
public static void main(String[] args) 
 {
    j k = new j();  //create the object for subclass 
    k.j = 8;
    k.i = 5;
    k.printNum();   // calling the subclass method with object 
}

}



