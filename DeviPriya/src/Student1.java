public class Student1 {
    int phone_no,roll_no;
    String adress;
    Student1(int ph_no,int r_no,String ad)
    {
        phone_no = ph_no;
        roll_no = r_no;
        adress= ad;

    }
  /* public void diaplay()
    {
        System.out.println(phone_no+""+roll_no+""+adress);
    }*/

    public static void main(String[] args) {
        Student1 s1 = new Student1(123456789,12,"Kng");
        Student1 s2= new Student1(789456123,13,"Hyd");
       // s1.display();
        //s2.display();
        System.out.println(s1.phone_no+ " "+s1.roll_no+" "+s1.adress);
        System.out.println(s2.phone_no+ " "+s2.roll_no+" "+s2.adress);



    }
}





    

