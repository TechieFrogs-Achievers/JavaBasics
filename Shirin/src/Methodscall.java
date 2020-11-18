 class Variables 
 {
    int var=250;
    static int value=350;
    void method()
    {
    int i=5;
    int j=9;
    int k=i+j;
    int z=i*j;
    System.out.println(k);
    System.out.println(z);
    }
}
    public class  Methodscall extends Variables
    {
        public static void main(String[] args)
         {

            int num=450;
            System.out.println(num);
            System.out.println(value);
            Variables a= new Variables();
            a.method();
            System.out.println(a.var);



            
        }
    }



    
