class Member
{
    String name ="sasi";    //data members for member class
    int age=21;
    long phno=896255277;
    String adress="seethanagarm";
    float salary=34944;
    void salary()
    {
        System.out.println("salary:"+salary);
    }
}
    class  Employee extends Member // Employee acquring the properties from member class
    {
        String specilazation; //data member
        String department;    //data members
        void show()
        {
            System.out.println(name+" "+ age+" "+phno+" "+adress);
        }
    }
    class Manager extends Member ////Manager  acquring the properties from Employee class
    { 
        String specilazation; //data members
        String department;     // data members
        void display()
        {
            System.out.println(name+" "+ age+" "+phno+" "+adress);
        }
    }
        public class DataMembers 
        {
            public static void main(String[] args) 
            {
                Employee e=new Employee(); //object creation for Employee class 
                e.show();
                Manager m=new Manager();
                m.display();
            }
        } 
    