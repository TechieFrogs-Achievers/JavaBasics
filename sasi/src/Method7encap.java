 class Method7  //parent class
 {
    int i;
    void  Printnum(int i) // parent class method
    {
        System.out.println(i);
    }
}
class Method1 extends Method7 // child class getting properties from child 
{
    int j;
    void Printnum(int j) //child class method
    {
        System.out.println(j);
    }
}
class Method7encap extends Method7
{
    public static void main(String[] args)
     {
        Method7encap m=new Method7encap(); //object creation for  parent class
        m.Printnum(4); //calling mthod with object for parent class
        Method7 n=new Method7(); //calling mthod with object from child class
        m.Printnum(5); //calling mthod with object from child class
    }
}
