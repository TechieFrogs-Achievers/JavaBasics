public class Constructorchain {
    //using constructorchain
    private Constructorchain()
    {
    int Id= 76;
    String Name ="Saiii";
    System.out.println("Name of the student in class: "+Name+" "+Id);
    }
    private Constructorchain(String specialization)
    {
        this();
        System.out.println("the specialization is:"+specialization);
    }
    public Constructorchain(int fine)
    {
        this("Mba");
        System.out.println("the fine is:"+fine);
    }
    public static void main(String[] args) {
         //new Constructorchain();
         //new Constructorchain("Mba");
         new Constructorchain(2200);

     }
}
