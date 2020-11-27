class Add   
    {
        public void show(long a, long b)   //creating method 
        {
            System.out.println(a+b);   //prints  the sum 
        }
       // public void show(char ch1, char ch2)
        //{
            //System.out.println(ch1+ch2); //throws the val by adding the two char
        //}
        public void show(String str1,String str2)
        {
            System.out.println(str1+str2); //concate the two strings
        }
        public void show(int a,String str)   //concatenating int & string var
        {
            System.out.println(a+str);
        }
    }
    public class OperatorOverloading 
    {
        public static void main(String[] args)
         {
             Add o = new Add();   //creating object for the parent class
             o.show(67874998,234567891);
             //o.show('a','b');
             o.show("bindu","ketha"); 
             o.show(34,"ISTS");  //displays the strings

         }
}
