package Exceptions;


 class DogName implements Cloneable
{
    private String dname;
    public DogName(String dname)
    {
        this.dname=dname;
    }
    public String getName()
    {
        return dname;
    }
    //overriding clone() method of object class
    public Object clone() throws CloneNotSupportedException
    {
        return (DogName)super.clone();
    }
    public static void main(String[] args) 
    {
        DogName obj1=new DogName("Tommy");
        try{
           // DogName obj1=new DogName("Tommy");
            DogName obj2=(DogName) obj1.clone();
            System.out.println(obj2.getName());
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }

}
