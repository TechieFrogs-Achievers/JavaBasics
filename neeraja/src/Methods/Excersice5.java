package Methods;

//parent class
class Degree
{
    //instance method to print degree
    void getDegree(String degree)
    {
      System.out.println(degree);
    }
}
    // child class undergrdauate extending the degree class 
    class UnderGraduate extends Degree{
        //public method to print String value
        public void display(){
            getDegree("I am UnderGraduate");
        }
    }
    // child class  postgraduate extending the degree class 
    class PostGraduate extends Degree{
        //public method to print String value
        public void display(){
            getDegree("I am Post Graduate");
        }
    }

public class Excersice5 {
    public static void main(String[] args) {
        //instance of class degree
        Degree d= new Degree();
        d.getDegree("I got Degree");
        //instance of class undergraduate
        UnderGraduate u = new UnderGraduate();
        u.display();
        //instance of class postgraduate
        PostGraduate p= new PostGraduate();
        p.display();
    }
        
      
}

