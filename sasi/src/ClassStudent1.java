public class ClassStudent1 
{
    String name;
    int rno ;    
    long phnno;  
    String adress;
        
        ClassStudent1(String stud_name,int stud_rno,long stud_num,String stud_adress)
        {
            name=stud_name;
            rno=stud_rno;
            phnno=stud_num;
            adress=stud_adress;
        }
        void display()
        {
        System.out.println(name+" "+rno+" "+phnno+" "+adress);
        }
        public static void main(String args[])
         {
            ClassStudent1 studobj=new  ClassStudent1("sam",10, 987654311,"hyd");
            ClassStudent1 studobj1=new  ClassStudent1("john",20, 987654311,"hyd");
            studobj.display();
            studobj1.display();
        }
    }

