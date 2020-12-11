package Exceptions;

 class Inst
 {
   int first,second;
   Inst(int a,int b)  {  //Here there is no default constructor i.e. a constructor with no arguments 
   first=a;
   second=b;
   }
  }

  //driver class
  class Exp
  {
  public static void main(String args[])throws IllegalAccessException,ClassNotFoundException
  {
  Class cl=Inst.class;
  //Exception handler
  try {
      cl.newInstance();
  } 
  catch (java.lang.InstantiationException e) {
      
      e.printStackTrace();
  }
}
}

 /* class Inst
  {
  }

class Exp
{
public static void main(String args[])throws IllegalAccessException,ClassNotFoundException
{
    try{
Class cl=Serializable.class;//Representing the serializable interface as a class
cl.newInstance();
    }
    catch(Exception i){
        i.printStackTrace();
    }
}
}*/

