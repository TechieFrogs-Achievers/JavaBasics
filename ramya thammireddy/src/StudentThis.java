public class StudentThis
{
    
        int rollno;  
        String name;  
        float fee;  
        StudentThis(int rollno,String name,float fee)
        {  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;  
        }  
        void display()
        {
                 
                System.out.println(rollno+" "+name+" "+fee);
 
        }     
        public static void main(String args[])
        {  
        StudentThis s1=new StudentThis(111,"ramya",5000f);  
        StudentThis s2=new StudentThis(112,"divya",6000f);  
        s1.display();  
        s2.display();  
        }
}  
    

