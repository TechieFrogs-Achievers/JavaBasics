package Interface;
interface fields//interface
{
    int x = 5;
    void display();//abstract method
}
 class  InterfaceExample3 
{  //int y = x; //because they are final they can't be implement anywhere
    public static void main(String[] args)
    { 
        System.out.println(fields.x);//here it can access by class name hence it is static
    }
}
