package Package;

public class Package2 
{
    public int add(int a, int b)
    {
        return a+b;
    }
       public static void main(String args[]){
        Package2 obj = new Package2();
        System.out.println(obj.add(10, 20));
       }
}
