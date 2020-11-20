class ClassStudent
 {
     int rno;
     String name;
     ClassStudent(String stud_name,int stud_rno)
     {
     name=stud_name;
     rno=stud_rno;
 }
 void display()
 {
     System.out.println(name+" "+rno);
 }
    public static void main(String[] args) 
    {
        ClassStudent s1=new ClassStudent("jhon",2);
        s1.display();
    }
}

