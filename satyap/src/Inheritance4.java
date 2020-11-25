class Rectangle1 // using inheritance Rectangle class
{
    int length; // Datamembers
    int breadth;
    void area() // Method for parent class of area of void return return type
    {
         int area=length*breadth;
        System.out.println("area:"+area);
    }
    void perimeter() // method of perimter for parent class with void returntype
    {
        int perimeter=2*(length+breadth);
        System.out.println("perimeter:"+perimeter);
    }
    Rectangle1(int l,int b) // constructor for parent class
    {
      length=l; // intializing datamembers with paramters
      breadth=b;
    }
    void display() // method display to display the l,b
    {
      System.out.println("length:"+length+" "+"breadth:"+breadth);
    }
}
class Square extends Rectangle1 // child class
{
    int side; // datamember
  Square(int s) // constructor for child class
  {
    super(s,s); // inheriting side
  }
}
class Inheritance4 // main class
{
  public static void main(String[] args) {
    Rectangle1 r=new Rectangle1(41,36); //obj creation for rectangle class ie parent class
    r.area(); // method calling for area
    r.display(); // methid calling for display
    r.perimeter(); // method calling for perimeter
    Square s=new Square(5); // obj creation for child class
    s.area();// method calling child class area
    s.perimeter(); // method calling child class perimeter


  }
}


    
