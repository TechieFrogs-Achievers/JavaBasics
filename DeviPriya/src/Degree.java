 public class Degree 
 {
     public void display()
     {
         System.out.println("I got a degree");
     }
     class  UnderGraduate
    {
        public void display()
        {
            System.out.println("I am an undergraduate");
        }
    }
        class PostGraduate
        {

            public void display()
            {
                System.out.println("I am a Postgraduate");
            }
        }
    

    
            public static void main(String args[])
            {
             Degree d= new Degree();
             d.display();
             UnderGraduate ug= new UnderGraduate();
             ug.display();
             PostGraduate pg= new PostGraduate();
             pg.display();


            }


    
}
