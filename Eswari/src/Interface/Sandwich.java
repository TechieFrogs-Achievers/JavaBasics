package Interface;

//interface creation
interface FastFood
{
    //abstract methods creation
    public void paniPuri();
    public void noodles();
}

public class Sandwich implements FastFood 
{
    //abstract methods implementation
    public void paniPuri()
    {
        System.out.println("Pani puri.......");
    }
    //abstract methods implementation
    public void noodles()
    {
        System.out.println("Noodles.......");
    }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();                    //object creation
        s.paniPuri();                                   //methods calling
        s.noodles();
    }

    
}
