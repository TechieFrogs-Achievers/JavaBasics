package Exceptions;
    class Exceptions16 
     {
        //instancevariable
        String firstName;
        String lastName;
         //constructor
         public Exceptions16(String firstName, String lastName) throws Exception{
            this.firstName = firstName;
            this.lastName = lastName;
        }

        //driver code
        public static void main(String[] args) throws Exception 
        {
            //user defined exception handler
            try {
                Exceptions16 c = new Exceptions16("durga", "hi");
                //cloning class clone object
                Exceptions16 c1 = (Exceptions16) c.clone();
    
                System.out.println(c.firstName+" "+c.lastName);
                System.out.println(c1.firstName+" "+c1.lastName);
            }
             catch (CloneNotSupportedException e) {
             e.printStackTrace();
            }
        }
    }
              

