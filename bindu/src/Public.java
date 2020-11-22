public class Public {
        //using public acess modifier
    String name;
    int rno;
     public void student(String std_name,int std_rno)
    {
        name=std_name;//assigning stdname to name
        rno=std_rno;
    }
    public void display()
    {
        System.out.println(name+" "+rno);
    }
    public static void main(String[] args) 
    {
      Public p = new Public();//creating object to student class
      p.student("sai",1997);  
    }
    
}

    

