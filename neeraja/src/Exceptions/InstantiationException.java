package Exceptions;

import java.lang.reflect.Constructor;
//program to throw instanceexception 
class InstantiationException {
    int a;
    public InstantiationException( int a){
    this.a=a;
    }
   //instance method
    void message(){
        System.out.println("Hello Java");
        System.out.println(a);
    }  
   }  
     
   class Test{  
    public static void main(String args[])  throws Exception{  
     try{  
    //instantiation of object using newinstance() method using both Class class and constructor class 
    //Constructor c=InstantiationException.class.getConstructor();
     Class c=Class.forName("InstantiationException");  
     InstantiationException s = (InstantiationException) c.newInstance();
     s.message();  
     
     }
     //Excepsion handler
     catch(Exception e){
         System.out.println(e);}  
     
    }  
   }  
