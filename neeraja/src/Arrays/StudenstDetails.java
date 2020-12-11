package Arrays;
//program to print 10 student deails using array of objects
class Student{
    //data members ina class student
    String name;
    int age;
    String address;
    int i=0;

    //constructor to initialize data memebers
    public Student(String name, int age, String address ){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public Student() {
    }

    // setInfo method to assaign same values
    public void setInfo(String name, int age){
        String  stu_name =name;
        int  stu_age =age;
        System.out.println(stu_name);
        System.out.println(stu_age);
    }
  
    //method to print all student details
    public void takes(String name, int age, String address ){
        
        System.out.println(i+" th student details ");
        System.out.println("Name    : "+name);
        System.out.println("age     : "+age);
        System.out.println("address : "+address);
        System.out.println("-------------------------");
        i++;
    }
}



public class StudenstDetails {

    public static void main(String[] u){

        Student  obj1=new Student("unknown",20,"unavailable");
        Student[] obj=new Student[10];
                  
              
       obj[0]=new Student();               //creating objects for each student and calling 
       obj[0].takes("raj",20,"nuzvid");    //their respective method to print details 
       obj[1]=new Student();
       obj[1].takes("neeru",4,"nuzvid");
       obj[2]=new Student();
       obj[2].takes("hari",30,"nuzvid");
       obj[3]=new Student();
       obj[3].takes("jaya",80,"nuzvid");
       obj[4]=new Student();
       obj[4].takes("josh",25,"nuzvid");
       obj[5]=new Student();
       obj[5].takes("arun",30,"nuzvid");
       obj[6]=new Student();
       obj[6].takes("rams",20,"nuzvid");
       obj[7]=new Student();
       obj[7].takes("hfnj",20,"nuzvid");
       obj[8]=new Student();
       obj[8].takes("durga",20,"nuzvid");
       obj[9]=new Student();
       obj[9].takes("mohana",20,"nuzvid");

       //for(int i=0; i<10 ;i++){
      //     obj[i]=new Student()
      // }

    }
    
}
