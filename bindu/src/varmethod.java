public class varmethod {
    int val=64;
    static int Num=75;   
    void techie()     //creating method
    {
        int var=100;    //assigning val to the variable
        System.out.println(var);
    }
    public static void main(String[] args) {
        System.out.println(Num);
        varmethod v =new varmethod();     //creating object using the class name
        System.out.println(v.val);   //caling instance var by object 
        v.techie();                  //calling method  by the object  

        
        
    } 
    
}
