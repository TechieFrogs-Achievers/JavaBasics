 class UpcastingAndDowncasting {
    public static void main (String args[]){
        class Parent { 
    
    String name; 
  
    // A method which prints the 
    // signature of the parent class 
    void method() 
    { 
        System.out.println("Method from Parent"); 
    } 
} 
  
// Child class 
class Child extends Parent { 
    int id; 
  
    // Overriding the parent method 
    // to print the signature of the 
    // child class 
    @Override
    void method() 
    { 
        System.out.println("Method from Child"); 
    } 
} 
  
// Demo class to see the difference 
// between upcasting and downcasting 

        // Upcasting 
        Parent p = new Child(); 
        p.name = "GeeksforGeeks"; 
  
        // This parameter is not accessible 
        // p.id = 1; 
        System.out.println(p.name); 
        p.method(); 
  
        // Trying to Downcasting Implicitly 
        // Child c = new Parent(); - > compile time error 
  
        // Downcasting Explicitly 
        Child c = (Child)p; 
  
        c.id = 1; 
        System.out.println(c.name); 
        System.out.println(c.id); 
        c.method(); 
    } 
}

