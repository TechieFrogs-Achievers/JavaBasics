public class PrintNumber 
 {
    void addPrintn(int a,int b)  // method with parameters
    {
        System.out.println("Addition:"+(a+b));
    }
    void Printn( float f,long d)
    {
       // float salary=2000f;
        //double phno=987444455;
        System.out.println("details:"+ f +" "+d);
    }
    void Printn(char c)
    {
       // char ch='s';
        System.out.println("character:"+c);
    }
    void Printn(String s)
    {
        //String name ="sasi";
        System.out.println("name:"+s);
    }
public static void main(String[] args) 
{
    PrintNumber p=new PrintNumber(); // object creation for 
   // PrintNumber p=new PrintNumber(); 
   p.addPrintn(2,3);
   p.Printn(29000,975685467); //method calling with object
   p.Printn('k');
   p.Printn("sasi");


}
 }