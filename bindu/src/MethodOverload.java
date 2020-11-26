public class MethodOverload  //parent class
{ 
    //int marks;
    //String Name;
    void Display(int marks,String Name)  //creating the method for no.of arguments
    {
        System.out.println(marks +" "+Name);
    }
    void Display(int marks,String Name,String Branch)  //no.of arguments 
    {
        System.out.println(marks+" "+Name+" "+Branch);
    }
    void Display(int marks,String Name,String Branch,int id)
    {
        System.out.println(marks+" "+Name+" "+Branch+" "+id);
    }
    public static void main(String[] args) 
    {
        MethodOverload m = new MethodOverload(); //creating object for the parent class 
        m.Display(75,"SANA"); //calling the method with the object
        m.Display(72,"MAHI");
        m.Display(78,"RIYA","IT");
        m.Display(79,"SAHA","MBA",231);
    }
}
