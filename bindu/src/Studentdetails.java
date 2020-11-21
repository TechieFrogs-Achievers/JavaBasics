public class Studentdetails {
    String name;
    int rollno;
    long phno;
    String address;

    Studentdetails(String std_name,String std_address,int std_rollno,long std_phno)
    {
        name=std_name;
        address=std_address;
        rollno=std_rollno;
        phno=std_phno;
        
    }
     void school()
    {
        System.out.println(name+"  "+address+"  "+phno+"  "+rollno);
    }
    public static void main(String[] args) {
         Studentdetails sd1=new Studentdetails("sam", "mancherial",951589005,33);
         Studentdetails sd2=new Studentdetails("john","bhupalpally",809938382,56);
         sd1.school();
        sd2.school();
}
}
