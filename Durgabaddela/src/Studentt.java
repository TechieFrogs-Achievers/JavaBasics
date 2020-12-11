import java.util.Scanner;

public class Studentt
    {

     String name;
     int age;
     String address;
    public Studentt(String name2, int age2, String address2)
    {
     this.name="unknown";
     this.age=0;
     this.address="not avaliable";
     }
     public void setInfo(int age,String name)
     {
      System.out.println("name of student  is : " +name + "\n"+" age of student : " +age);
     }
     public void setInfo( String name, int age ,String address)
     {
      System.out.println("name of  student  : "  +name +  "\n" +" age of student :  " +age  + " \n"+ " Address of student is : " +address);
     }
     void display()
     {
         System.out.println("Name : " +name);
         System.out.println("Age : " +age);
         System.out.println("Address : " +address);
     }
     public static void main(String[] args)
    {
         /*s[0] = new Studentt();
         s[0].setInfo("durga",20,"nuzvid");
         s[1] = new Studentt();
         s[1].setInfo("neeraja",25,"nuzvid");
         s[2] = new Studentt();
         s[2].setInfo("mohana",24,"jrg");
         s[3] = new Studentt();
         s[3].setInfo("ramya",22,"angara");
         s[4] = new Studentt();
         s[4].setInfo("sreeja",21,"hyderabad");
         s[5] = new Studentt();
         s[5].setInfo("lakshmi",20,"kpd");
         s[6] = new Studentt();
         s[6].setInfo("hari",12,"vij");
         s[7] = new Studentt();
         s[7].setInfo("neeru",14,"rr peta");
         s[8] = new Studentt();
         s[8].setInfo("mohan",27,"jgp");
         s[9] = new Studentt();
         s[9].setInfo("shirin",15,"rjy");*/
         Studentt s[] = new Studentt[10];
         String name, address; int age,j=10;
         System.out.println(" Enter Details of Students ");
 
         Scanner sc = new Scanner(System.in);
 
         for (int i = 0; i < 10; i++) 
         {
             System.out.println(" Enter details of " + (i + 1) + " Student");
             System.out.println("Name : ");
             name = sc.next();
             System.out.println("Age : ");
             age = sc.nextInt();
             System.out.println("Address : ");
             address = sc.next();
             s[i]= new Studentt(name,age,address);
             s[i].setInfo(name, age,address);
 
         }
 
         //System.out.println("Displaying Details of Students Entered");
         //for (int i = 0; i < j; i++) {
            //System.out.println("Details of " + (i + 1) + " Student is");
            //s[i].display();
 
             
         
 
         sc.close();
        

     }

}



