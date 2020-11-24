public class StudentInfo 
{   
    int age;
    String address,name;
    //constructor created
    StudentInfo()
    {
        name="unknown";
        age=0;
        address="not available";
    }
    //method for print name and age 
    public void setInfo(String name,int age)
    {
      System.out.println("name="+name+"\n"+"age="+age);  
    }
    //method for print name,age,address
    public void setInfo(String name,int age,String address)
    {
      System.out.println("name="+name+"\n"+"age="+age+"\n"+"Address="+address);  
    }
    
  public static void main(String[] args) 
  {
     StudentInfo si=new StudentInfo();//object creation
     si.setInfo("jhon",21);//assign values and method calling
     si.setInfo("abi", 22, "rajanagaram");//assign values and method calling 
  }  
}
