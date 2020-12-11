//public class Exception19 {
    class Animal {
        public void eat(String str) {
            System.out.println("Eating for grass");
        }
    }
    
    class Goat extends Animal {
        public void eat(String str) {
            System.out.println("blank");
        }
    }
    
    class Another extends Goat{
      public void eat(String str) {
            System.out.println("another");
      }
    }
    
    public class Exception19 {
        public static void main(String[] args) {
            Animal a = new Animal();
            //Another t5 = (Another) new Goat();
            Another a1= (Another)new Goat(); // cannot create an instance of the Another class using Goat.
           // Goat g = new Another(); //it is possible to create instance 
        }
    }
    

