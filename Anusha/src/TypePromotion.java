public class TypePromotion
{ 
    //method for differ
    void difference(int x,long y)
    {
        System.out.println("Diffrence="+(x-y));//20-20=0
    }
    void difference(int x,float y,int z)
    {
        System.out.println("Diffrence="+(x-y-z));//20-20-20.0=-20.0
    }
    void diffrence(int x,int y)
    {
        System.out.println("diffrence:"+(x-y));
    }
    public static void main(String[] args) 
    {
      TypePromotion tp=new TypePromotion();//create object
      tp.difference(20, 20); //type int promoted to long 
      tp.difference(20,20,20);//type int promoted to float
      //tp.diffrence(12458l, 20);//error becase can't promote the long to int
    }
}
