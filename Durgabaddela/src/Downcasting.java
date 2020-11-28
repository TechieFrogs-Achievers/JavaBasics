 class One 
{ 
  void m1() 
  { 
     System.out.println("m1 method in class One"); 
   } 
 } 
  class Two extends One 
 { 
   void m1() //override Method
   { 
      System.out.println("m1 method in class Two"); 
    } 
 } 
 class Downcasting 
{ 
  public static void main(String[] args) 
  { 
    // Super class reference refers to sub class object.
     One o = new Two(); 

     // Converting super class reference type into sub class reference type 

     Two t = (Two)o;  
      t.m1(); 
      o.m1(); 
   } 
 }

    

