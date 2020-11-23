public class ThisExample4 
{
    String stdName = "John";
    String address = " hyd"; 

    /*Example4( String stdName , String address)
    {  
          this. stdName = stdName;
          this.address = address;
    }*/

       public void display()
      {  
     /* here it prints the new values as we given here because of this keyword*/

     this.stdName = " Tom ";
     this.address = " rjy";
     System.out.println( this.stdName + "   "+ this.address);  
      }  
 public static void main(String[] args) 
 {
     
     ThisExample4 ex = new ThisExample4();
      ex.display();
     
 }
    
}
