package Interface;
 interface icecream1       //creating the interface
 {
     public void venila(String a);   //methods
     public void butterscotch(String b);
 }
 interface fruits  //creating interface2
 {
     public void Apple(String c);
     public void Orange(String d);
 }
 interface flowers
 {
     public void hibiscus(String e);
     public void rose(String f);
 }
 interface Favourites extends icecream1,fruits,flowers   //inherits all the above interfaces
 {
     public void input(String items);
     
 }  
    public class Typesofinterfaces implements Favourites  //main class implements the inherited class
    {
        public void venila(String a)  //assigning the arguments
    {
        String items = a;  
        System.out.println("The venila icecream is madeup of :"+items); //prints the items 
    }
    public void butterscotch(String b)
    {
        String items = b;
        System.out.println("The butterscotch is a combination of :"+items);
        
    }
    public void Apple(String c)   //arguments
    {
        String items = c;
        System.out.println("The surface of apple is:"+items);
    } 
    public void Orange(String d)
    {
        String items = d;
        System.out.println("The taste of Orange is:"+items);

    }
    public void hibiscus(String e)
    {
        String items =e;   //assigning value to the argument
        System.out.println("The color of hibiscus is:"+items);

    }
    public void rose(String f)
    {
        String items = f;
        System.out.println("The sense of rose is:"+items);

    }
    public void input(String items)
    {
        System.out.println("Above all Are Daily Sources:");
    }

        public static void main(String[] args) 
        {
            Favourites f = new Typesofinterfaces();//creating the method for the interface
            f.input("uses");
            f.venila("Milk");   //calling the methods
            f.butterscotch("Cashews");
            f.Apple("Smooth");
            f.Orange("Bitter");
            f.hibiscus("Red");
            f.rose("natural");
            
        }
    }



    

