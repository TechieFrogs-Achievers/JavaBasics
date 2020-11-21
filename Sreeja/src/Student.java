public class Student
 {
    /*
    
    String name;

     int roll_no;
    
    void insert(String x,int y)
    {
        name = x;
        roll_no = y;
    }
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       s1.insert("john",2);
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        
    }

    */



    int rollNumber;
    long phoneNumber;
    String address;

    void insert(int x,long y, String z)
    {
        rollNumber = x;
        phoneNumber = y;
        address = z;
    }


    void display()
    {
        System.out.println(rollNumber+" "+phoneNumber+" "+address+" ");
    }
     public static void main(String[] args)
      {
          Student sam = new Student();
          Student John = new Student();
          sam.insert(2,4476727676l," syddisgdysuyfdsyu");
          John.insert(3, 7237227884l, " jduydgfyafssdsjdsyd");
        sam.display();
        John.display();
        
    }



    






}

