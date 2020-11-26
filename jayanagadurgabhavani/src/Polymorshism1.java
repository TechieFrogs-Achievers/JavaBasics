public class Polymorshism1 
{
    void add()
    {
        System.out.println("defacly add");
    }

void add(int a,int b)
{
    System.out.println("adding of two numbers:"+ " " +(a+b));
}
void add(int a, int b, int c)
{
    System.out.println("addting of three numbers:"+ " "+(a+b+c));
}
   

    public static void main(String[] args) 
    {
        Polymorshism1  a=new Polymorshism1 ();
        a.add();
        a.add(11,11);//given values acceding
        a.add(11,11,11);//values asseding
    }
}
