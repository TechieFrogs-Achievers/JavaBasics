public class Demo3
{
    
        private String name;
    
        // getter method
        public String getName() 
        {
            return this.name;
        }
        // setter method
        public void setName(String name) 
        {
            this.name= name;
        }
    
    
        public static void main(String[] main)
        {
            Demo3 d = new Demo3();
    
            // access the private variable using the getter and setter
            d.setName("ramya");
            System.out.println(d.getName());
        }      
         

}
    

    

