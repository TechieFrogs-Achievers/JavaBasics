public class Exception16 {
    class clone  {
        //instancevariable
        String firstName;
        String lastName;
         //constructor
         public clone(String firstName, String lastName) throws Exception{
            this.firstName = firstName;
            this.lastName = lastName;
        }
    
        //driver code
        public static void main(String args[]) throws Exception 
        {
            //user defined exception handler
            try {
                clone c = new clone("neeraja","bejawada");
                //cloning class clone object
                clone c1 = (clone) c.clone();
    
                System.out.println(c.firstName+" "+c.lastName);
                System.out.println(c1.firstName+" "+c1.lastName);
            }
             catch (CloneNotSupportedException e) {
             e.printStackTrace();
            }
    
    
        }
    
}
